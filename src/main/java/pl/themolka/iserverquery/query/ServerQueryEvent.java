package pl.themolka.iserverquery.query;

import pl.themolka.iserverquery.ServerQuery;
import pl.themolka.iserverquery.event.Event;

public class ServerQueryEvent extends Event {
    private final ServerQuery query;

    public ServerQueryEvent(ServerQuery query) {
        this.query = query;
    }

    public ServerQuery getQuery() {
        return this.query;
    }
}
