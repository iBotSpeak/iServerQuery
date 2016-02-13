package pl.themolka.iserverquery.io;

import pl.themolka.iserverquery.util.Callback;

public interface Updatable {
    void updateData();

    void updateData(Callback done);
}
