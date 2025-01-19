package ru.nti.singleton;

public class Container {

    private static final Container INSTANCE = new Container();

    public static Container getInstance() {
        return INSTANCE;
    }
}
