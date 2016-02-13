package pl.themolka.iserverquery.client;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class UniqueIdentifier {
    private String identifier;

    public UniqueIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UniqueIdentifier) {
            return ((UniqueIdentifier) obj).getIdentifier().equals(this.getIdentifier());
        }
        return false;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(this.identifier)
                .build();
    }
}
