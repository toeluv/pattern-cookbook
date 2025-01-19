package ru.nti.memento;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Version {

    private long version = 0L;

    private Version() {}

    public static Version create() {
        return new Version();
    }

    public void update() {
        version += 1;
    }
}
