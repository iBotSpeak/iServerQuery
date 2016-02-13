package pl.themolka.iserverquery;

import pl.themolka.iserverquery.command.CommandSystem;
import pl.themolka.iserverquery.event.EventSystem;
import pl.themolka.iserverquery.server.Server;
import pl.themolka.iserverquery.util.Platform;

public class ServerQuery {
    private String build;
    private CommandSystem commands;
    private EventSystem events;
    private String identifier;
    private Platform platform;
    private Server server;
    private String version;

    public ServerQuery() {
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

    public void setServerQuery(
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
}
