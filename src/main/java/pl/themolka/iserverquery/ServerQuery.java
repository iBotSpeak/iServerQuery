package pl.themolka.iserverquery;

import pl.themolka.iserverquery.command.CommandSystem;
import pl.themolka.iserverquery.event.EventSystem;
import pl.themolka.iserverquery.server.Server;
import pl.themolka.iserverquery.util.Platform;

public class ServerQuery {
    private final String build;
    private final CommandSystem commands;
    private final EventSystem events;
    private final String identifier;
    private final Platform platform;
    private final Server server;
    private final String version;

    public ServerQuery(
            String build,
            CommandSystem commands,
            EventSystem events,
            String identifier,
            Platform platform,
            Server server,
            String version
    ) {
        this.build = build;
        this.commands = commands;
        this.events = events;
        this.identifier = identifier;
        this.platform = platform;
        this.server = server;
        this.version = version;
    }

    public String getBuildVersion() {
        return this.build;
    }

    public CommandSystem getCommands() {
        return this.commands;
    }

    public EventSystem getEvents() {
        return this.events;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public Platform getPlatform() {
        return this.platform;
    }

    public Server getServer() {
        return this.server;
    }

    public String getVersion() {
        return this.version;
    }
}
