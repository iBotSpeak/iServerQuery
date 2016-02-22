package pl.themolka.iserverquery.query;

import pl.themolka.iserverquery.ServerQuery;

public class QuerySelectEvent extends ServerQueryEvent {
    public static final int UNKNOWN = -1;

    private final int serverId;
    private final int port;

    public QuerySelectEvent(ServerQuery query, int serverId, int port) {
        super(query);

        this.serverId = serverId;
        this.port = port;
    }

    public int getServerId() {
        return this.serverId;
    }

    public int getPort() {
        return this.port;
    }
}
