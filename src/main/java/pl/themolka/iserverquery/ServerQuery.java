package pl.themolka.iserverquery;

import pl.themolka.iserverquery.command.CommandSystem;
import pl.themolka.iserverquery.command.Console;
import pl.themolka.iserverquery.event.EventSystem;
import pl.themolka.iserverquery.io.ResponseListener;
import pl.themolka.iserverquery.server.Server;
import pl.themolka.iserverquery.text.QueryTextEncoding;
import pl.themolka.iserverquery.util.Platform;
import pl.themolka.iserverquery.util.ShutdownHook;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;

public interface ServerQuery {
    String getBuild();

    CommandSystem getCommands();

    Console getConsole();

    Charset getEncoding();

    EventSystem getEvents();

    InetSocketAddress getHost();

    String getIdentifier();

    Platform getPlatform();

    Server getServer();

    ShutdownHook getShutdownHook();

    Socket getSocket();

    QueryTextEncoding getTextEncoding();

    String getVersion();

    boolean isRunning();

    void login(String username, String password);

    void logout();

    void query(String query);

    void registerResponse(String command, ResponseListener listener);

    void selectById(int serverId, boolean virtual);

    void selectByPort(int port, boolean virtual);

    void start();

    void stop();
}
