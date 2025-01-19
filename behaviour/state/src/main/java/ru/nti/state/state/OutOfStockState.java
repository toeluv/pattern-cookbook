package ru.nti.state.state;

import ru.nti.state.domain.State;

public class OutOfStockState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Out of stock state: Product unavailable. Please select another product.");
    }
}
