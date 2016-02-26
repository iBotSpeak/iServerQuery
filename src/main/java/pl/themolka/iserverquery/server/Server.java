package pl.themolka.iserverquery.server;

import pl.themolka.iserverquery.channel.Channel;
import pl.themolka.iserverquery.client.Client;
import pl.themolka.iserverquery.client.ConnectedClient;
import pl.themolka.iserverquery.client.UniqueIdentifier;
import pl.themolka.iserverquery.io.Fetchable;

import java.util.Collection;

public interface Server extends Fetchable {
    void createChannel(Channel channel);

    ConnectedClient findConnectedClient(String username);

    Channel getChannel(int id);

    Channel getChannel(String name);

    Client getClient(int databaseId);

    Client getClient(UniqueIdentifier identifier);

    ConnectedClient getConnectedClient(int id);

    ConnectedClient getConnectedClient(UniqueIdentifier identifier);

    ConnectedClient getConnectedClient(String username);

    Collection<ConnectedClient> getConnectedClients();

    Channel getDefaultChannel();

    int getReservedSlots();

    int getSlots();
}
