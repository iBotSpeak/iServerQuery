package pl.themolka.iserverquery.channel;

import pl.themolka.iserverquery.event.QueryEvent;

public class ChannelEvent extends QueryEvent {
    private final Channel channel;

    public ChannelEvent(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return this.channel;
    }
}
