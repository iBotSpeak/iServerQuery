package pl.themolka.iserverquery.channel;

public class ChannelPasswordEvent extends ChannelEditEvent {
    public ChannelPasswordEvent(Channel channel) {
        super(channel);
    }

    public String getPassword() {
        return this.getChannel().getPassword();
    }
}
