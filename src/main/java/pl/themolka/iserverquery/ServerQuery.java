package pl.themolka.iserverquery;

import pl.themolka.iserverquery.command.CommandSystem;
import pl.themolka.iserverquery.event.EventSystem;
import pl.themolka.iserverquery.server.Server;
import pl.themolka.iserverquery.text.QueryTextEncoding;
import pl.themolka.iserverquery.util.Platform;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;

public interface ServerQuery {
    String getBuild();

    CommandSystem getCommands();

    Charset getEncoding();

    EventSystem getEvents();

    InetSocketAddress getHost();

    String getIdentifier();

    Platform getPlatform();

    Server getServer();

    Socket getSocket();

    QueryTextEncoding getTextEncoding();

    String getVersion();

    void login(String username, String password);

    void logout();

    void selectById(int serverId, boolean virtual);

    void selectByPort(int port, boolean virtual);

    void start();

    void stop();
}
