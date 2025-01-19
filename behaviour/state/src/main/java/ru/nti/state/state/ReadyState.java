package ru.nti.state.state;

import ru.nti.state.domain.State;

public class ReadyState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Ready state: Please select a product.");
    }
}
