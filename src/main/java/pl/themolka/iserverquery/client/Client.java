package pl.themolka.iserverquery.client;

import pl.themolka.iserverquery.io.Fetchable;
import pl.themolka.iserverquery.io.Updatable;

public interface Client extends Fetchable, Updatable {
    int getDatabaseId();

    String getDescription();

    UniqueIdentifier getIdentifier();

    String getUsername();

    boolean isOnline();
}
