package ru.nti.state.domain;

import lombok.Setter;

@Setter
public class VendingMachine {

    private State state;

    public VendingMachine(State state) {
        this.state = state;
    }

    public void request(){
        state.handleRequest();
    }
}
