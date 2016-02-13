package pl.themolka.iserverquery;

import org.apache.commons.lang3.builder.Builder;
import pl.themolka.iserverquery.command.CommandSystem;
import pl.themolka.iserverquery.event.EventSystem;
import pl.themolka.iserverquery.server.Server;
import pl.themolka.iserverquery.util.Platform;

import java.util.UUID;

public class ServerQueryBuilder implements Builder<ServerQuery> {
    private String build;
    private CommandSystem commands;
    private EventSystem events;
    private String identifier;
    private Platform platform;
    private Server server;
    private String version;

    public ServerQueryBuilder() {
        String identifier = UUID.randomUUID().toString();

        this.build = "(unknown build)";
        this.commands = null;
        this.events = new EventSystem(identifier);
        this.identifier = identifier;
        this.platform = Platform.valueOf("unknown");
        this.server = null;
        this.version = "(unknown version)";
    }

    @Override
    public ServerQuery build() {
        if (this.server == null) {
            throw new IllegalArgumentException("server variable is not set");
        }

        ServerQuery serverQuery = new ServerQuery();
        serverQuery.setServerQuery(
                this.build,
                this.commands,
                this.events,
                this.identifier,
                this.platform,
                this.server,
                this.version
        );

        return serverQuery;
    }

    public ServerQueryBuilder build(String build) {
        this.build = build;
        return this;
    }

    public ServerQueryBuilder commands(CommandSystem commands) {
        this.commands = commands;
        return this;
    }

    public ServerQueryBuilder events(EventSystem events) {
        this.events = events;
        return this;
    }

    public ServerQueryBuilder identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public ServerQueryBuilder platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    public ServerQueryBuilder server(Server server) {
        this.server = server;
        return this;
    }

    public ServerQueryBuilder version(String version) {
        this.version = version;
        return this;
    }
}
