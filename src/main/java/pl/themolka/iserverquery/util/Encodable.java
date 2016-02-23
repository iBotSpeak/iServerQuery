package pl.themolka.iserverquery.util;

public interface Encodable<T> {
    T decode(String decode);

    String encode(T encode);
}
