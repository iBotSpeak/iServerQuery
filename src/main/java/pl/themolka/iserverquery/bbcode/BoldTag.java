package pl.themolka.iserverquery.bbcode;

public class BoldTag extends BBCodeTag.PreparedTag {
    public static final String TAG_NAME = "b";

    public BoldTag() {
        this(null);
    }

    public BoldTag(String text) {
        super(TAG_NAME, null, text);
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }
}
