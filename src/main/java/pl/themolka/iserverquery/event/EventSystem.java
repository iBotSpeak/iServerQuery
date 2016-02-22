package pl.themolka.iserverquery.event;

import com.google.common.eventbus.EventBus;

public class EventSystem extends EventBus {
    public EventSystem(String identifier) {
        super(identifier);
    }

    @Override
    public void post(Object event) {
        if (event instanceof Event) {
            super.post(event);
        } else {
            throw new IllegalArgumentException("Not instance of the Event class");
        }
    }
}
