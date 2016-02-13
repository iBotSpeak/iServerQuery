package pl.themolka.iserverquery.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultContextParser implements CommandContext.IContextParser {
    public static final char FLAG_PREFIX = '-';
    public static final char FLAG_QUOTE = '\"';

    private Map<String, Object> flags = new HashMap<>();
    private List<Object> params = new ArrayList<>();

    @Override
    public CommandContext parse(Command command, String[] args) {
        String flag = null;
        StringBuilder flagValue = null;

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (flagValue != null) {
                flagValue.append(" ");

                if (arg.endsWith(String.valueOf(FLAG_QUOTE))) {
                    flagValue.append(arg.substring(0, arg.length() - 1));

                    this.flags.put(flag, flagValue.toString());
                    flag = null;
                    flagValue = null;
                    continue;
                }

                flagValue.append(arg);
                continue;
            }

            if (flag != null && arg.startsWith(String.valueOf(FLAG_QUOTE))) {
                flagValue = new StringBuilder().append(arg.substring(1));
                continue;
            }

            if (arg.startsWith(String.valueOf(FLAG_PREFIX))) {
                flag = arg.substring(1);

                if (command.hasFlag(flag)) {
                    this.flags.put(flag, null);
                    continue;
                }
            }

            flag = null;
            this.params.add(arg);
        }

        return new CommandContext(command, this.flags, this.params);
    }

    public Map<String, Object> getFlags() {
        return this.flags;
    }

    public List<Object> getParams() {
        return this.params;
    }
}
