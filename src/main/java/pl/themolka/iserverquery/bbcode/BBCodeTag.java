package pl.themolka.iserverquery.bbcode;

import pl.themolka.iserverquery.text.Message;
import pl.themolka.jbb.BBTag;

public class BBCodeTag extends BBTag implements Message {
    public BBCodeTag() {
        super();
    }

    public BBCodeTag(String name) {
        super(name);
    }

    public BBCodeTag(String name, String attribute) {
        super(name, attribute);
    }

    public BBCodeTag(String name, String attribute, String textValue) {
        super(name, attribute, textValue);
    }

    @Override
    public String getMessage() {
        return BBCode.toString(this);
    }

    public abstract class PreparedTag extends BBCodeTag {
        public PreparedTag() {
            super();
        }

        public PreparedTag(String name) {
            super(name);
        }

        public PreparedTag(String name, String attribute) {
            super(name, attribute);
        }

        public PreparedTag(String name, String attribute, String textValue) {
            super(name, attribute, textValue);
        }

        public abstract String getTagName();
    }
}
