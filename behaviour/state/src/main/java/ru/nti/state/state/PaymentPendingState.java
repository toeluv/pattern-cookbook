package ru.nti.state.state;

import ru.nti.state.domain.State;

public class PaymentPendingState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Payment pending state: Dispensing product.");
    }
}
