package ru.nti.memento.domain;

import ru.nti.memento.Version;

public interface Caretaker {
    void save(Snapshot snapshot);
    Snapshot getLast();
    Snapshot getByVersion(Version version);
    void undo();
}
