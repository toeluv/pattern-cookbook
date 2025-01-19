package ru.nti.builder;

import lombok.Getter;

@Getter
public class DockerContainer {

    private DockerContainer() {}

    private String name;
    private String image;
    private int exposedPort;
    private boolean withStdOut;

    public static class Builder {

        private final DockerContainer INSTANCE = new DockerContainer();

        public Builder withName(String name) {
            INSTANCE.name = name;
            return this;
        }

        public Builder withImage(String image) {
            INSTANCE.image = image;
            return this;
        }

        public Builder withExposedPort(int exposedPort) {
            INSTANCE.exposedPort = exposedPort;
            return this;
        }

        public Builder withStdOut(boolean withStdOut) {
            INSTANCE.withStdOut = withStdOut;
            return this;
        }

        public DockerContainer build() {
            return INSTANCE;
        }
    }
}
