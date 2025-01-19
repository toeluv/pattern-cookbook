package ru.nti.mediator.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PowerSupplier {

    public void turnOn() {
        System.out.println("Turning power supply on");
    }

    public void turnOff() {
        System.out.println("Turning power supply off");
    }
}
