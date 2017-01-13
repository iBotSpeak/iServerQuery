package pl.themolka.iserverquery.util;

import pl.themolka.iserverquery.ServerQuery;

public class ShutdownHook extends Thread {
    protected final ServerQuery serverQuery;

    public ShutdownHook(ServerQuery serverQuery) {
        super(serverQuery.toString() + " Shutdown Hook Thread");

        this.serverQuery = serverQuery;
    }

    @Override
    public void run() {
        this.serverQuery.stop();
    }
}
