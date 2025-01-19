package ru.nti.state;

import ru.nti.state.domain.VendingMachine;
import ru.nti.state.state.OutOfStockState;
import ru.nti.state.state.PaymentPendingState;
import ru.nti.state.state.ProductSelectedState;
import ru.nti.state.state.ReadyState;

public class Main {

    public static void main(String[] args) {
        // Create context
        VendingMachine vendingMachine = new VendingMachine(new ReadyState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new ProductSelectedState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new PaymentPendingState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new OutOfStockState());

        // Request state change
        vendingMachine.request();
    }
}
