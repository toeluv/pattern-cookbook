package ru.nti.mediator.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fan {

    private boolean isOn = false;
    private Mediator mediator;

    public void turnOn() {
        System.out.println("Turning fan on");
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Turning fan off");
        isOn = false;
        mediator.stop();
    }
}
