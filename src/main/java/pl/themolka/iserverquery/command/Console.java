package pl.themolka.iserverquery.command;

import pl.themolka.iserverquery.ServerQuery;
import pl.themolka.iserverquery.text.Message;
import pl.themolka.iserverquery.text.StringMessage;
import pl.themolka.iserverquery.util.Platform;

public class Console implements CommandSender {
    private final ServerQuery server;

    public Console(ServerQuery server) {
        this.server = server;
    }

    @Override
    public String getName() {
        return "Console";
    }

    @Override
    public Platform getPlatform() {
        return this.server.getPlatform();
    }

    @Override
    public boolean isConsole() {
        return true;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println(message.getMessage());
    }

    @Override
    public void sendMessage(String message) {
        this.sendMessage(new StringMessage(message));
    }

    public ServerQuery getServer() {
        return this.server;
    }
}
