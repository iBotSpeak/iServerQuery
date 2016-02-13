package pl.themolka.iserverquery.command;

public class CommandException extends Exception {
    public static final int NOT_IMPLEMENTED = 0;
    public static final int CLIENT_NEEDED = 1;

    private final int id;

    public CommandException(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
