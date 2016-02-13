package pl.themolka.iserverquery.event;

public abstract class Event {
    public String getEventName() {
        return this.getClass().getName();
    }
}
