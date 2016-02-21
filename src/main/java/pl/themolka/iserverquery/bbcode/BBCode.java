package pl.themolka.iserverquery.bbcode;

import pl.themolka.iserverquery.text.Message;
import pl.themolka.jbb.BBObject;
import pl.themolka.jbb.BBSingleTag;
import pl.themolka.jbb.BBTag;
import pl.themolka.jbb.JBBCode;
import pl.themolka.jbb.parser.BBDefaultParser;
import pl.themolka.jbb.parser.BBException;
import pl.themolka.jbb.parser.BBParser;

public class BBCode extends JBBCode implements Message {
    @Override
    public String getMessage() {
        return toString(this);
    }

    public static BBTag parse(String code) throws BBException {
        return new BBParser(new BBDefaultParser()).parse(code);
    }

    public static String toString(Object object) {
        if (object instanceof JBBCode) {
            return toString(((JBBCode) object).getRoot());
        } else if (object instanceof BBSingleTag) {
            BBSingleTag tag = (BBSingleTag) object;

            if (tag.hasName()) {
                tag.setName(tag.getName().toUpperCase());
            } else {
                return null;
            }

            if (tag.hasAttribute()) {
                return "[" + tag.getName() + "=" + tag.getAttribute() + "]";
            } else {
                return "[" + tag.getName() + "]";
            }
        } else if (object instanceof BBTag) {
            BBTag tag = (BBTag) object;

            StringBuilder values = new StringBuilder();
            if (tag.hasValues()) {
                for (BBObject listObject : tag.getValues()) {
                    String string = toString(listObject);

                    if (string != null) {
                        values.append(string);
                    }
                }
            }

            if (tag.hasName()) {
                tag.setName(tag.getName().toUpperCase());
            } else {
                return values.toString();
            }

            if (tag.hasAttribute()) {
                return "[" + tag.getName() + "=" + tag.getAttribute() + "]" + values.toString() + "[/" + tag.getName() + "]";
            } else {
                return "[" + tag.getName() + "]" + values.toString() + "[/" + tag.getName() + "]";
            }
        } else {
            return object.toString();
        }
    }
}
