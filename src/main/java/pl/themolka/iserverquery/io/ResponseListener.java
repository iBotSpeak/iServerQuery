package pl.themolka.iserverquery.io;

import java.util.List;
import java.util.Map;

public interface ResponseListener {
    void onResponse(String query, Map<String, String> parameters, List<String> options);
}
