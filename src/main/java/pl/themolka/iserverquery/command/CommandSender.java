package pl.themolka.iserverquery.command;

import pl.themolka.iserverquery.text.Message;
import pl.themolka.iserverquery.util.Platform;

public interface CommandSender {
    String getName();

    Platform getPlatform();

    boolean isConsole();

    void sendMessage(Message message);

    void sendMessage(String message);
}
