package pl.themolka.iserverquery.channel;

public class ChannelMoveEvent extends ChannelEditEvent {
    public ChannelMoveEvent(Channel channel) {
        super(channel);
    }

    public int getOrder() {
        return this.getChannel().getOrder();
    }
}
