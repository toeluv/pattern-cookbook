package ru.nti.flyweight;

import ru.nti.flyweight.domain.DockerDaemon;
import ru.nti.flyweight.domain.Image;
import ru.nti.flyweight.domain.ImageType;

public class Main {

    public static void main(String[] args) {
        Image alpine = DockerDaemon.createImage(ImageType.ALPINE);
        Image nginx = DockerDaemon.createImage(ImageType.NGINX);
        Image cachedAlpine = DockerDaemon.createImage(ImageType.ALPINE);
        Image cachedNginx = DockerDaemon.createImage(ImageType.NGINX);
    }
}
