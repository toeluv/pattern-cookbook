package ru.nti.flyweight.domain;

import java.util.HashMap;

// - flyweight
public class DockerDaemon {
    private static HashMap<ImageType, Image> images = new HashMap<>();

    private DockerDaemon() {
    }
    public static Image createImage(ImageType type){
        return images.computeIfAbsent(type, newImage -> new DockerImage(type));
    }
}
