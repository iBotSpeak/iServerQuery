package pl.themolka.iserverquery.bbcode;

public class StrikethroughTag extends BBCodeTag.PreparedTag {
    public static final String TAG_NAME = "s";

    public StrikethroughTag() {
        this(null);
    }

    public StrikethroughTag(String text) {
        super(TAG_NAME, null, text);
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }
}
