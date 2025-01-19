package ru.nti.bridge.shape;

import ru.nti.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
        color.fillColor();
    }
}
