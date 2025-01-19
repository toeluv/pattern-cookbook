package ru.nti.mediator;

import ru.nti.mediator.domain.Button;
import ru.nti.mediator.domain.Fan;
import ru.nti.mediator.domain.Mediator;
import ru.nti.mediator.domain.PowerSupplier;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        PowerSupplier powerSupplier = new PowerSupplier();
        Button button = new Button();
        Fan fan = new Fan();

        fan.setMediator(mediator);
        button.setMediator(mediator);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);
        button.press();
        button.press();
    }
}
