package pl.themolka.iserverquery.text;

import pl.themolka.iserverquery.event.QueryEvent;

public class MessageEvent extends QueryEvent {
    private final Message message;

    public MessageEvent(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return this.message;
    }
}
