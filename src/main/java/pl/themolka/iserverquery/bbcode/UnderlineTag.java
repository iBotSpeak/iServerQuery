package pl.themolka.iserverquery.bbcode;

public class UnderlineTag extends BBCodeTag.PreparedTag {
    public static final String TAG_NAME = "u";

    public UnderlineTag() {
        this(null);
    }

    public UnderlineTag(String text) {
        super(TAG_NAME, null, text);
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }
}
