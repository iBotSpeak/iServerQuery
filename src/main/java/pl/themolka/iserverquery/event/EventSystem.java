package pl.themolka.iserverquery.event;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.SubscriberExceptionHandler;

public class EventSystem extends EventBus {
    public EventSystem() {
    }

    public EventSystem(String identifier) {
        super(identifier);
    }

    public EventSystem(SubscriberExceptionHandler exceptionHandler) {
        super(exceptionHandler);
    }
}
