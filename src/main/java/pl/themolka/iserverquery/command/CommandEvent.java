package pl.themolka.iserverquery.command;

import pl.themolka.iserverquery.event.Event;

public class CommandEvent extends Event {
    private final Command command;

    public CommandEvent(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return this.command;
    }
}
