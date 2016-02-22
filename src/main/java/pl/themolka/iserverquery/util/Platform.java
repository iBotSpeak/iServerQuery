package pl.themolka.iserverquery.util;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Platform {

    public static final Platform ANDROID = new Platform("android", "Android");
    public static final Platform IOS = new Platform("ios", "iOS");
    public static final Platform LINUX = new Platform("unix", "Linux");
    public static final Platform MAC = new Platform("mac", "Mac");
    public static final Platform SOLARIS = new Platform("sunos", "Solaris");
    public static final Platform WINDOWS = new Platform("win", "Windows");

    public static final Platform UNKNOWN = new Platform("unknown", "Unknown");
    private static Platform system;

    private final String id;
    private final String name;

    private Platform(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Platform) {
            ((Platform) obj).getName().equals(this.getName());
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasId() {
        return this.id != null;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(this.id)
                .append(this.name)
                .build();
    }

    public static Platform system() {
        if (system == null) {
            system = fromSystem();
        }

        return system;
    }

    public static Platform valueOf(String name) {
        for (Platform platform : values()) {
            if (platform.getName().equals(name)) {
                return platform;
            }
        }

        return new Platform(name.toLowerCase(), name);
    }

    public static Platform[] values() {
        return new Platform[] {
                ANDROID, IOS, LINUX, MAC, SOLARIS, WINDOWS
        };
    }

    private static Platform fromSystem() {
        String name = null;
        try {
            name = System.getProperty("os.name");
        } catch (SecurityException ex) {
        }

        if (name == null) {
            return Platform.UNKNOWN;
        }
        name = name.toLowerCase();

        for (Platform platform : values()) {
            if (name.startsWith(platform.getName().toLowerCase())) {
                return platform;
            }
        }

        return new Platform(name.toLowerCase(), name);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(fromSystem());
    }
}
