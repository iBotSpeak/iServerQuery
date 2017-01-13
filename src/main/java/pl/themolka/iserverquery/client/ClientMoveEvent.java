package pl.themolka.iserverquery.client;

import pl.themolka.iserverquery.channel.Channel;

public class ClientMoveEvent extends ClientEvent {
    private final Channel channel;

    public ClientMoveEvent(ConnectedClient client, Channel channel) {
        super(client);

        this.channel = channel;
    }

    public Channel getChannel() {
        return this.channel;
    }
}
