package pl.themolka.iserverquery.text;

public class ImmutableMessage implements Message {
    private final String message;

    private ImmutableMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImmutableMessage) {
            return ((ImmutableMessage) obj).getMessage().equals(this.getMessage());
        }
        return false;
    }

    @Override
    public final String getMessage() {
        return this.message;
    }

    public static ImmutableMessage from(String message) {
        return new ImmutableMessage(message);
    }
}
