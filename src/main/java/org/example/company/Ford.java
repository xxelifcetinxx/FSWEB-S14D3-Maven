package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> V8 engine roars!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> smooth acceleration";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> disc brakes applied";
    }
}
