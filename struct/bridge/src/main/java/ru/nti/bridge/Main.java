package ru.nti.bridge;

import ru.nti.bridge.color.GreenColor;
import ru.nti.bridge.color.RedColor;
import ru.nti.bridge.shape.Circle;
import ru.nti.bridge.shape.Rectangle;


public class Main {

    public static void main(String[] args) {
        new Circle(new RedColor()).draw();
        new Rectangle(new GreenColor()).draw();
    }
}
