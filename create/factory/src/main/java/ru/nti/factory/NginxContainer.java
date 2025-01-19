package ru.nti.factory;

public class NginxContainer extends Container {

    public NginxContainer(String name, String tag) {
        super(name, Image.NGINX, tag);
    }
}
