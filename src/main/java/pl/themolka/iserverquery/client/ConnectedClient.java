package pl.themolka.iserverquery.client;

import pl.themolka.iserverquery.channel.Channel;
import pl.themolka.iserverquery.command.CommandSender;
import pl.themolka.iserverquery.text.Message;

public interface ConnectedClient extends Client, CommandSender {
    void addPermission();

    String getAwayMessage();

    Channel getChannel();

    String getCountry();

    int getTalkPower();

    int getTalkRequest();

    String getTaskRequestMessage();

    String getVersion();

    boolean isAway();

    boolean isChannelCommander();

    boolean isMuted();

    boolean isPrioritySpeaker();

    boolean isRecording();

    void kick(Message reason);

    void move(Channel destination);

    void poke(Message message);

    void removePermission();
}
