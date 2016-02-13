package pl.themolka.iserverquery.command;

import pl.themolka.iserverquery.event.Cancelable;

public class CommandRegisterEvent extends CommandEvent implements Cancelable {
    private boolean cancel;
    private final String name;
    private boolean override;

    public CommandRegisterEvent(Command command, String name, boolean override) {
        super(command);

        this.name = name;
        this.override = override;
    }

    @Override
    public boolean isCanceled() {
        return this.cancel;
    }

    @Override
    public void setCanceled(boolean cancel) {
        this.cancel = cancel;
    }

    public String getName() {
        return this.name;
    }

    public boolean isOverride() {
        return this.override;
    }

    public void setOverride(boolean override) {
        this.override = override;
    }
}
