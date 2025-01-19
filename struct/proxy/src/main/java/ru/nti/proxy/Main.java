package ru.nti.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        DockerRegistry registry = new LocalDockerRegistry(new RemoteDockerRegistry());
        DockerImage nginx = registry.pullImage(Image.NGINX);
        DockerImage nginx2 = registry.pullImage(Image.NGINX);
    }
}

enum Image {
    NGINX, ALPINE
}

@AllArgsConstructor
@Data
class DockerImage {

    private Image image;
    private String tag;
}

interface DockerRegistry {

    DockerImage pullImage(Image name);
}

class RemoteDockerRegistry implements DockerRegistry {

    @Override
    public DockerImage pullImage(Image name) {
        return new DockerImage(name, "latest");
    }
}

class LocalDockerRegistry implements DockerRegistry {

    public LocalDockerRegistry(DockerRegistry registry) {
        this.registry = registry;
    }

    private DockerRegistry registry;
    private HashMap<Image, DockerImage> images = new HashMap<>();

    @Override
    public DockerImage pullImage(Image name) {
        DockerImage image = images.get(name);
        if (image == null) {
            System.out.println("Image not present in local registry, will pull from remote...");
            image = registry.pullImage(name);
            images.put(name, image);
            System.out.println("Pulled from remote image: " + image.getImage() + ":" + image);
        } else {
            System.out.println("Image in local registry exists: " + image.getImage() + ":" + image);
        }
        return image;
    }
}
