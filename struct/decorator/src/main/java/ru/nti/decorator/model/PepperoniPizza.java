package ru.nti.decorator.model;

public class PepperoniPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pepperoni";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
