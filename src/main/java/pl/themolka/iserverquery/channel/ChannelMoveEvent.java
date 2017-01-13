package pl.themolka.iserverquery.channel;

public class ChannelMoveEvent extends ChannelEditEvent {
    private final int order;

    public ChannelMoveEvent(Channel channel, int order) {
        super(channel);

        this.order = order;
    }

    public int getOrder() {
        return this.order;
    }
}
