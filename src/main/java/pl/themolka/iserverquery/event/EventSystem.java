package pl.themolka.iserverquery.event;

import com.google.common.eventbus.EventBus;

public class EventSystem extends EventBus {
    public EventSystem(String identifier) {
        super(identifier);
    }
}
