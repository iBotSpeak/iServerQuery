package pl.themolka.iserverquery.bbcode;

public class URLTag extends BBCodeTag.PreparedTag {
    public static final String TAG_NAME = "url";

    public URLTag() {
        this(null);
    }

    public URLTag(String url) {
        this(url, url);
    }

    public URLTag(String url, String title) {
        super(TAG_NAME);

        if (title != null) {
            this.setAttribute(url);
            this.addText(title);
        } else {
            this.addText(url);
        }
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }

    public String getTitle() {
        if (this.hasAttribute()) {
            return this.getValues().toString();
        } else {
            return this.getAttribute();
        }
    }

    public String getURL() {
        if (this.hasAttribute()) {
            return this.getAttribute();
        } else {
            return this.getValues().toString();
        }
    }
}
