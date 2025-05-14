package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> engine starting with turbo";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerating with AWD";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> braking with ABS";
    }
}
