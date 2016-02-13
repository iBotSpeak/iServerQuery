package pl.themolka.iserverquery.channel;

import pl.themolka.iserverquery.client.ConnectedClient;
import pl.themolka.iserverquery.io.Fetchable;
import pl.themolka.iserverquery.io.Updatable;
import pl.themolka.iserverquery.text.Message;

import java.util.Collection;

public interface Channel extends Fetchable, Updatable {
    Collection<ConnectedClient> getClients();

    Message getDescription();

    int getId();

    int getMaxClients();

    int getMaxFamilyClients();

    String getName();

    int getOrder();

    String getPassword();

    int getTalkPower();

    String getTopic();

    boolean hasTalkPower();

    boolean hasPassword();

    boolean isDefault();

    boolean isPermanent();

    boolean isSemiPermanent();

    boolean isUnlimited();

    void setDefault(boolean isDefault);

    void setDescription(Message description);

    void setMaxClients(int maxClients);

    void setMaxFamilyClients(int maxClients);

    void setName(String name);

    void setOrder(int order);

    void setPassword(String password);

    void setPermanent(boolean permanent);

    void setSemiPermanent(boolean semi);

    void setTalkPower(int talkPower);

    void setTopic(String message);

    void setUnlimited(boolean unlimited);
}
