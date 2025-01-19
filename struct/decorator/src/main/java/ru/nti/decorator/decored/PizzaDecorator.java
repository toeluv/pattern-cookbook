package ru.nti.decorator.decored;

import ru.nti.decorator.model.Pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
