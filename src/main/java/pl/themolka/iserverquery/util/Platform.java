package pl.themolka.iserverquery.util;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Platform {
    public static final Platform ANDROID = new Platform("android", "Android");
    public static final Platform IOS = new Platform("ios", "iOS");
    public static final Platform LINUX = new Platform("unix", "Linux");
    public static final Platform MAC = new Platform("mac", "Mac");
    public static final Platform SOLARIS = new Platform("sunos", "Solaris");
    public static final Platform WINDOWS = new Platform("win", "Windows");

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
                .append(this.name)
                .build();
    }

    public static Platform valueOf(String name) {
        for (Platform platform : new Platform[] {
                ANDROID, IOS, LINUX, MAC, SOLARIS, WINDOWS
        }) {
            if (platform.getName().equals(name)) {
                return platform;
            }
        }

        return new Platform(null, name);
    }
}
