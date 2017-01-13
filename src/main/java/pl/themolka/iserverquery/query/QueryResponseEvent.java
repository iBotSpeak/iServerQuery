package pl.themolka.iserverquery.query;

import pl.themolka.iserverquery.ServerQuery;
import pl.themolka.iserverquery.command.CommandContext;

public class QueryResponseEvent extends ServerQueryEvent {
    private final String rawResponse;
    private final CommandContext[] response;

    public QueryResponseEvent(ServerQuery query, String rawResponse, CommandContext[] response) {
        super(query);

        this.rawResponse = rawResponse;
        this.response = response;
    }

    public CommandContext getFirstResponse() {
        if (!this.isResponseEmpty()) {
            return this.getResponse()[0];
        }
        return null;
    }

    public CommandContext getLastResponse() {
        if (!this.isResponseEmpty()) {
            return this.getResponse()[this.getResponseSize() - 1];
        }
        return null;
    }

    public String getRawResponse() {
        return this.rawResponse;
    }

    public CommandContext[] getResponse() {
        return this.response;
    }

    public int getResponseSize() {
        return this.getResponse().length;
    }

    public boolean isResponseEmpty() {
        return this.getResponse().length == 0;
    }
}
