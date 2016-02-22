package pl.themolka.iserverquery.query;

import pl.themolka.iserverquery.ServerQuery;

public class QueryStartEvent extends ServerQueryEvent {
    public QueryStartEvent(ServerQuery query) {
        super(query);
    }
}
