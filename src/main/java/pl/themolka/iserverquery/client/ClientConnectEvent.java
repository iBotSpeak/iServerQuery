package pl.themolka.iserverquery.client;

import pl.themolka.iserverquery.channel.Channel;

public class ClientConnectEvent extends ClientEvent {
    public ClientConnectEvent(ConnectedClient client) {
        super(client);
    }

    public Channel getChannel() {
        return this.getClient().getChannel();
    }
}
