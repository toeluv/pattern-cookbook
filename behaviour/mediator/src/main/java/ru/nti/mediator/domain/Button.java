package ru.nti.mediator.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Button {

    private Mediator mediator;

    public void press() {
        mediator.press();
    }
}
