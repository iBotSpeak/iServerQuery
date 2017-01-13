package pl.themolka.iserverquery.channel;

import pl.themolka.iserverquery.text.Message;

public class ChannelDescriptionEvent extends ChannelEditEvent {
    private final Message description;

    public ChannelDescriptionEvent(Channel channel, Message description) {
        super(channel);

        this.description = description;
    }

    public Message getDescription() {
        return this.description;
    }
}
