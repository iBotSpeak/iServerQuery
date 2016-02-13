package pl.themolka.iserverquery.command;

import pl.themolka.iserverquery.client.ConnectedClient;

public class Command {
    private final String command;
    private final boolean consoleOnly;
    private final String[] flags;

    public Command(String command, boolean consoleOnly, String[] flags) {
        this.command = command.trim().toLowerCase();
        this.consoleOnly = consoleOnly;
        this.flags = flags;
    }

    public String getCommand() {
        return this.command;
    }

    public String[] getFlags() {
        return this.flags;
    }

    public void handleCommand(CommandSender sender, CommandContext context) throws CommandException {
        if (sender instanceof ConnectedClient) {
            this.handleCommand((ConnectedClient) sender, context);
        } else {
            throw new CommandException(CommandException.CLIENT_NEEDED);
        }
    }

    public void handleCommand(ConnectedClient sender, CommandContext context) throws CommandException {
        throw new CommandException(CommandException.NOT_IMPLEMENTED);
    }

    public boolean hasFlag(String flag) {
        for (String f : this.flags) {
            if (f.equals(flag)) {
                return true;
            }
        }
        return false;
    }

    public boolean isConsoleOnly() {
        return this.consoleOnly;
    }
}
