package ru.nti.factory;

public abstract class Container {

    protected String name;
    protected Image image;
    protected String tag;

    public String getImageTag() {
        return image + ":" + tag;
    }

    public Container(String name, Image image, String tag) {
        this.name = name;
        this.image = image;
        this.tag = tag;
    }
}
