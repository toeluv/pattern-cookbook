package ru.nti.memento.domain;

import lombok.Data;
import ru.nti.memento.Version;

@Data
public abstract class Snapshot {
    private Version version;
    private String content;

    public Snapshot(Version version, String content) {
        this.content = content;
        this.version = version;
    }
}
