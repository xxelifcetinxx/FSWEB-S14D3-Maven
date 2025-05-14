package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startup with rumble";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> high torque launch";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> quick stop with ABS";
    }
}
