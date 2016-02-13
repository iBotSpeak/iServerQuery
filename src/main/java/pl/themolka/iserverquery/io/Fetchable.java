package pl.themolka.iserverquery.io;

import pl.themolka.iserverquery.util.Callback;

public interface Fetchable {
    void fetchData();

    void fetchData(Callback callback);
}
