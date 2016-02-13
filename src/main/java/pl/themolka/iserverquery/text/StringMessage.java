package pl.themolka.iserverquery.text;

import java.io.IOException;

public class StringMessage implements Appendable, Message {
    private String message;

    public StringMessage() {
        this(null);
    }

    public StringMessage(String message) {
        this.message = message;
    }

    @Override
    public StringMessage append(CharSequence csq) throws IOException {
        this.message += csq;
        return this;
    }

    @Override
    public StringMessage append(CharSequence csq, int start, int end) throws IOException {
        this.message += csq.subSequence(start, end);
        return this;
    }

    @Override
    public StringMessage append(char c) throws IOException {
        this.message += c;
        return this;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
