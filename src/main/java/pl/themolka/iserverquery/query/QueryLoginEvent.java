package pl.themolka.iserverquery.query;

import pl.themolka.iserverquery.ServerQuery;

public class QueryLoginEvent extends ServerQueryEvent {
    private final String username;

    public QueryLoginEvent(ServerQuery query, String username) {
        super(query);

        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }
}
