package pl.themolka.iserverquery.client;

import pl.themolka.iserverquery.channel.Channel;

public class ClientMoveEvent extends ClientEvent {
    public ClientMoveEvent(ConnectedClient client) {
        super(client);
    }

    public Channel getChannel() {
        return this.getClient().getChannel();
    }
}
