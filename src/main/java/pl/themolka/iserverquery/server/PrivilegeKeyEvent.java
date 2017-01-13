package pl.themolka.iserverquery.server;

public class PrivilegeKeyEvent extends ServerEvent {
    private final String privilegeKey;

    public PrivilegeKeyEvent(Server server, String privilegeKey) {
        super(server);

        this.privilegeKey = privilegeKey;
    }

    public String getPrivilegeKey() {
        return this.privilegeKey;
    }
}
