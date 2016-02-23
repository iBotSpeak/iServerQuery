package pl.themolka.iserverquery.query;

import pl.themolka.iserverquery.ServerQuery;

public class QuerySelectEvent extends ServerQueryEvent {
    public static final int UNKNOWN = -1;

    private final int port;
    private final int serverId;
    private final boolean virtual;

    public QuerySelectEvent(ServerQuery query, int port, int serverId, boolean virtual) {
        super(query);

        this.port = port;
        this.serverId = serverId;
        this.virtual = virtual;
    }

    public int getPort() {
        return this.port;
    }

    public int getServerId() {
        return this.serverId;
    }

    public boolean isVirtual() {
        return this.virtual;
    }
}
