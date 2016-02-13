package pl.themolka.iserverquery.client;

import pl.themolka.iserverquery.event.QueryEvent;

public class ClientEvent extends QueryEvent {
    private final ConnectedClient client;

    public ClientEvent(ConnectedClient client) {
        this.client = client;
    }

    public ConnectedClient getClient() {
        return this.client;
    }
}
