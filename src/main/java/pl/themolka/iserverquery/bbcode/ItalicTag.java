package pl.themolka.iserverquery.bbcode;

public class ItalicTag extends BBCodeTag.PreparedTag {
    public static final String TAG_NAME = "i";

    public ItalicTag() {
        this(null);
    }

    public ItalicTag(String text) {
        super(TAG_NAME, null, text);
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }
}
