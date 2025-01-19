package ru.nti.decorator;

import ru.nti.decorator.decored.PizzaDecorator;
import ru.nti.decorator.model.Pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " " + "Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
