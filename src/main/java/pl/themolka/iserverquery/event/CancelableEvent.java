package pl.themolka.iserverquery.event;

public abstract class CancelableEvent extends Event implements Cancelable {
    private boolean cancel;

    @Override
    public boolean isCanceled() {
        return this.cancel;
    }

    @Override
    public void setCanceled(boolean cancel) {
        this.cancel = cancel;
    }
}
