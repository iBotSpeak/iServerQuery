package pl.themolka.iserverquery.event;

public interface Cancelable {
    boolean isCanceled();

    void setCanceled(boolean cancel);
}
