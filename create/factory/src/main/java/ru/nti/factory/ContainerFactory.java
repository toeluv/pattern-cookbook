package ru.nti.factory;

public class ContainerFactory {

    public static Container createContainer(String name, Image image, String tag) {
        return switch (image) {
            case ALPINE -> new AlpineContainer(name, tag);
            case NGINX -> new NginxContainer(name, tag);
            case POSTGRES -> new PostgresContainer(name, tag);
        };
    }
}
