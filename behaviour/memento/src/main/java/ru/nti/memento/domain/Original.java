package ru.nti.memento.domain;

public interface Original {
    Snapshot save();
    void restoreFrom(Snapshot snapshot);
}
