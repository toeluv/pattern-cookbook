package ru.nti.builder;

public class Main {

    public static void main(String[] args) {
       DockerContainer container = new DockerContainer.Builder()
               .withName("ngnix-container")
               .withImage("nginx:latest")
               .withExposedPort(80)
               .withStdOut(false)
               .build();
    }
}
