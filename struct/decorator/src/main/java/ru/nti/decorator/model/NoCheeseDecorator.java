package ru.nti.decorator.model;

import ru.nti.decorator.decored.PizzaDecorator;

public class NoCheeseDecorator extends PizzaDecorator {

    public NoCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " without Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() - 5;
    }
}
