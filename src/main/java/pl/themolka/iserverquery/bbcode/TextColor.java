package pl.themolka.iserverquery.bbcode;

import java.awt.Color;

public class TextColor {
    public static final char HEX_PREFIX = '#';
    private final Color color;

    public TextColor(String hex) {
        if (!hex.startsWith(String.valueOf(HEX_PREFIX))) {
            hex = HEX_PREFIX + hex;
        }

        if (hex.length() == 4) {
            String red = hex.substring(1, 2);
            String green = hex.substring(2, 3);
            String blue = hex.substring(3, 4);

            this.color = Color.decode(HEX_PREFIX + (red + red) + (green + green) + (blue + blue));
        } else if (hex.length() == 7) {
            this.color = Color.decode(hex);
        } else {
            throw new IllegalArgumentException("Illegal HEX");
        }
    }

    public String getBBCodeAttribute() {
        return this.toString();
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return HEX_PREFIX + Integer.toHexString(this.getColor().getRGB() & 0xffffff);
    }
}
