package pl.themolka.iserverquery.command;

import pl.themolka.iserverquery.event.Cancelable;

public class CommandHandleEvent extends CommandEvent implements Cancelable {
    private boolean cancel;
    private final CommandContext context;
    private final CommandSender sender;

    public CommandHandleEvent(Command command, CommandContext context, CommandSender sender) {
        super(command);

        this.context = context;
        this.sender = sender;
    }

    @Override
    public boolean isCanceled() {
        return this.cancel;
    }

    @Override
    public void setCanceled(boolean cancel) {
        this.cancel = cancel;
    }

    public CommandContext getContext() {
        return this.context;
    }

    public CommandSender getSender() {
        return this.sender;
    }
}
