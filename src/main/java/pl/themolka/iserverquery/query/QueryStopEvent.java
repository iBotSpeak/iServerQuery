package pl.themolka.iserverquery.query;

import pl.themolka.iserverquery.ServerQuery;

public class QueryStopEvent extends ServerQueryEvent {
    public QueryStopEvent(ServerQuery query) {
        super(query);
    }
}
