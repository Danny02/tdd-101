package org.example;

import java.util.ArrayList;
import java.util.List;

public class Frame {

    private static final int INITIAL_PIN_NUMBER = 10;

    List<Pin> pins;

    public Frame() {
        this.pins = new ArrayList();
        for (int i = 0; i < INITIAL_PIN_NUMBER; i++) {
            pins.add(new Pin());
        }
    }

    public List<Pin> getPins() {
        return pins;
    }
}
