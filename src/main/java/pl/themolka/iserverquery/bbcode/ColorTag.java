package pl.themolka.iserverquery.bbcode;

public class ColorTag extends BBCodeTag.PreparedTag {
    public static final String TAG_NAME = "color";

    public ColorTag() {
        this(null);
    }

    public ColorTag(TextColor color) {
        this(color, null);
    }

    public ColorTag(TextColor color, String text) {
        super(TAG_NAME, color.getBBCodeAttribute(), text);
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }

    public String getColor() {
        return this.getAttribute();
    }
}
