package ru.nti.decorator;

import ru.nti.decorator.model.NoCheeseDecorator;
import ru.nti.decorator.model.PepperoniPizza;
import ru.nti.decorator.model.Pizza;

public class Main {


    public static void main(String[] args) {
        Pizza pepperoni = new PepperoniPizza();
        System.out.println(pepperoni.getDescription() + " costs: " + pepperoni.getCost() + "$");
        Pizza pepperoniWithCheese = new CheeseDecorator(pepperoni);
        System.out.println(pepperoniWithCheese.getDescription() + " costs: " + pepperoniWithCheese.getCost() + "$");
        Pizza pepperoniWithoutCheese = new NoCheeseDecorator(pepperoni);
        System.out.println(pepperoniWithoutCheese.getDescription() + " costs: " + pepperoniWithoutCheese.getCost() + "$");
    }
}
