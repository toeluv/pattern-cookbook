package ru.nti.factory;

public class Main {

    public static void main(String[] args) {
        Container nginx = ContainerFactory.createContainer("nginx", Image.NGINX, "latest");
    }
}
