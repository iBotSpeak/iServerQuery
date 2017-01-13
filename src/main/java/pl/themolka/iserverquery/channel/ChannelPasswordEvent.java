package pl.themolka.iserverquery.channel;

public class ChannelPasswordEvent extends ChannelEditEvent {
    private final String password;

    public ChannelPasswordEvent(Channel channel, String password) {
        super(channel);

        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
