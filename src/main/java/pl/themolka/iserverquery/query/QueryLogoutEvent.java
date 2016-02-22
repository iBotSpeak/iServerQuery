package pl.themolka.iserverquery.query;

import pl.themolka.iserverquery.ServerQuery;

public class QueryLogoutEvent extends ServerQueryEvent {
    public QueryLogoutEvent(ServerQuery query) {
        super(query);
    }
}
