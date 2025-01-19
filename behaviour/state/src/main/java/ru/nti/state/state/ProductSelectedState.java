package ru.nti.state.state;

import ru.nti.state.domain.State;

public class ProductSelectedState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Product selected state: Processing payment.");
    }
}
