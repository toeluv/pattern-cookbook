package ru.nti.composite;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        OrderFacade facade = new OrderFacadeImpl(
                List.of(
                        new AddOrderToCart(),
                        new PayForOrder(),
                        new CraftOrder(),
                        new ShipOrder()
        ));
        facade.processOrder();
    }
}

interface OrderProcessor {

    void process();
}

interface OrderFacade {
    void processOrder();
}

class AddOrderToCart implements OrderProcessor {

    @Override
    public void process() {
        System.out.println("Adding order to cart");
    }
}

class PayForOrder implements OrderProcessor {

    @Override
    public void process() {
        System.out.println("Processing payment");
    }
}

class CraftOrder implements OrderProcessor {

    @Override
    public void process() {
        System.out.println("Crafting order");
    }
}

class ShipOrder implements OrderProcessor {

    @Override
    public void process() {
        System.out.println("Shipping order");

    }
}

class OrderFacadeImpl implements OrderFacade{

    private List<OrderProcessor> processors;

    public OrderFacadeImpl(List<OrderProcessor> processors) {
        this.processors = processors;
    }

    @Override
    public void processOrder() {
        processors.forEach(OrderProcessor::process);
    }
}
