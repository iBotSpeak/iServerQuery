package pl.themolka.iserverquery.client;

import pl.themolka.iserverquery.channel.Channel;

public class ClientDisconnectEvent extends ClientEvent {
    public ClientDisconnectEvent(ConnectedClient client) {
        super(client);
    }

    public Channel getChannel() {
        return this.getClient().getChannel();
    }
}
