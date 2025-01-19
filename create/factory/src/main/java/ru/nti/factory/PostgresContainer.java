package ru.nti.factory;

public class PostgresContainer extends Container {

    public PostgresContainer(String name, String tag) {
        super(name, Image.POSTGRES, tag);
    }
}
