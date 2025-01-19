package ru.nti.flyweight.domain;

public class DockerImage implements Image {

    private ImageType imageType;

    public DockerImage(ImageType imageType) {
        this.imageType = imageType;
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void build() {
        System.out.println("Build Docker Image from: " + imageType.name());
    }

    @Override
    public void publish() {
        System.out.println("Publishing Docker Image from: " + imageType.name());
    }
}
