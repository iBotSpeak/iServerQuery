package pl.themolka.iserverquery.command;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

public class CommandContext {
    private final Command command;
    private final Map<String, Object> flags;
    private final List<Object> params;

    public CommandContext(Command command, Map<String, Object> flags, List<Object> params) {
        this.command = command;
        this.flags = flags;
        this.params = params;
    }

    public Command getCommand() {
        return this.command;
    }

    // Flags - Objects
    public Object getFlag(String flag) {
        return this.getFlag(flag, null);
    }

    public Object getFlag(String flag, Object def) {
        return this.flags.getOrDefault(flag, def);
    }

    // Flags - Doubles
    public double getFlagDouble(String flag) {
        return this.getFlagDouble(flag, 0.0);
    }

    public double getFlagDouble(String flag, double def) {
        return (double) this.getFlag(flag, def);
    }

    // Flags - Integers
    public int getFlagInt(String flag) {
        return this.getFlagInt(flag, 0);
    }

    public int getFlagInt(String flag, int def) {
        return (int) this.getFlag(flag, def);
    }

    // Flags - Strings
    public String getFlagText(String flag) {
        return this.getFlagText(flag, null);
    }

    public String getFlagText(String flag, String def) {
        return (String) this.getFlag(flag, def);
    }

    // Params - Objects
    public Object getParam(int index) {
        return this.getParam(index, null);
    }

    public Object getParam(int index, Object def) {
        if (this.params.size() <= index) {
            return def;
        }

        return this.params.get(index);
    }

    // Params - Doubles
    public double getParamDouble(int index) {
        return this.getParamDouble(index, 0.0);
    }

    public double getParamDouble(int index, double def) {
        return (double) this.getParam(index, def);
    }

    // Params - Build a full text
    public String getParamFullText(int from) throws IndexOutOfBoundsException {
        return this.getParamFullText(from, this.params.size());
    }

    public String getParamFullText(int from, int to) throws IndexOutOfBoundsException {
        return StringUtils.join(this.params.subList(from, to), " ");
    }

    // Params - Integers
    public int getParamInt(int index) {
        return this.getParamInt(index, 0);
    }

    public int getParamInt(int index, int def) {
        return (int) this.getParam(index, def);
    }

    public int getParamsLength() {
        return this.params.size();
    }

    // Params - Strings
    public String getParamText(int index) {
        return this.getParamText(index, null);
    }

    public String getParamText(int index, String def) {
        return (String) this.getParam(index, def);
    }

    public boolean hasFlag(String flag) {
        return this.flags.containsKey(flag);
    }

    public boolean hasFlagValue(String flag) {
        return this.getFlag(flag) != null;
    }

    public static CommandContext parse(Command command, String[] args) {
        return parse(command, args, null);
    }

    public static CommandContext parse(Command command, String[] args, IContextParser parser) {
        if (parser == null) {
            parser = new DefaultContextParser();
        }

        return parser.parse(command, args);
    }

    public interface IContextParser {
        CommandContext parse(Command command, String[] args);
    }
}
