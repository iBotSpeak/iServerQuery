package pl.themolka.iserverquery.channel;

import pl.themolka.iserverquery.text.Message;

public class ChannelDescriptionEvent extends ChannelEditEvent {
    public ChannelDescriptionEvent(Channel channel) {
        super(channel);
    }

    public Message getDescription() {
        return this.getChannel().getDescription();
    }
}
