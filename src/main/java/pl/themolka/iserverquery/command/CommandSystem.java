package pl.themolka.iserverquery.command;

import pl.themolka.iserverquery.ServerQuery;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandSystem {
    public static final String DEFAULT_PREFIX = "//";
    public static final String OVERRIDE_DEFAULT_PREFIX = ":";
    private final ServerQuery serverQuery;

    protected final Map<String, Command> commands = new HashMap<>();
    private String prefix = DEFAULT_PREFIX;

    public CommandSystem(ServerQuery serverQuery) {
        this.serverQuery = serverQuery;
    }

    public Command getCommand(String command) {
        return this.commands.get(command.toLowerCase());
    }

    public Map<String, Command> getCommands() {
        return new HashMap<>(this.commands);
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void handleCommand(CommandSender sender, CommandContext context) {
        try {
            CommandHandleEvent event = new CommandHandleEvent(context.getCommand(), context, sender);
            this.serverQuery.getEvents().post(event);

            if (!event.isCanceled()) {
                context.getCommand().handleCommand(event.getSender(), event.getContext());
            }
        } catch (CommandException ex) {
            sender.sendMessage("Error: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            sender.sendMessage("Could not convert string to numeric.");
        } catch (Throwable ex) {
            sender.sendMessage(String.format("Internal command error - %s. See the logs.", ex.getMessage()));
            // TODO log
        }
    }

    public void handleCommand(CommandSender sender, String commandLine, CommandContext.IContextParser parser) {
        if (!commandLine.startsWith(this.getPrefix())) {
            return;
        }

        String[] args = commandLine.split(" ");
        String name = args[0].substring(this.getPrefix().length());

        Command command = this.getCommand(name);
        if (command == null) {
            sender.sendMessage("Specified command doesn't exists. Type \"" + this.getPrefix() + "help\" for help.");
            return;
        }

        String[] commandArgs = new String[0];
        if (args.length > 1) {
            commandArgs = Arrays.copyOfRange(args, 1, args.length);
        }

        this.handleCommand(sender, CommandContext.parse(command, commandArgs, parser));
    }

    public void registerCommand(Command command) {
        this.registerCommand(command, false);
    }

    public void registerCommand(Command command, boolean override) {
        String name = command.getCommand();

        if (override) {
            this.injectCommand(name, command, override);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (this.getCommand(name) == null) {
                this.injectCommand(name, command, override);
                break;
            }

            name = OVERRIDE_DEFAULT_PREFIX + name;
        }
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    private void injectCommand(String name, Command command, boolean override) {
        CommandRegisterEvent event = new CommandRegisterEvent(command, name, override);
        this.serverQuery.getEvents().post(event);

        if (!event.isCanceled()) {
            this.commands.put(event.getName(), event.getCommand());
        }
    }
}
