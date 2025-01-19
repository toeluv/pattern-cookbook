package ru.nti.singleton;

public class Main {

    public static void main(String[] args) {
        Container firstContainer = Container.getInstance();
        Container secondContainer = Container.getInstance();
    }
}
