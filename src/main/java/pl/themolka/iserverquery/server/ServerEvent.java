package pl.themolka.iserverquery.server;

import pl.themolka.iserverquery.event.QueryEvent;

public class ServerEvent extends QueryEvent {
    private final Server server;

    public ServerEvent(Server server) {
        this.server = server;
    }

    public Server getServer() {
        return this.server;
    }
}
