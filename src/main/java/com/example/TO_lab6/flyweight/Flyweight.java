package com.example.TO_lab6.flyweight;

import com.example.TO_lab6.state.State;

public class Flyweight implements IFlyweight {
    private State state;

    @Override
    public State getState() {
        return this.state;
    }
}
