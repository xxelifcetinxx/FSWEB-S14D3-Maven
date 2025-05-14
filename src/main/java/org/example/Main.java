package org.example;

import org.example.arge.*;
import org.example.company.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("---- ARGE TESTLERİ ----");

        CarSkeleton gasCar = new GasPoweredCar("GasCar", "High performance", 15.5, 4);
        gasCar.startEngine();
        gasCar.drive();

        CarSkeleton electricCar = new ElectricCar("ElectricCar", "Green power", 250.0, 85);
        electricCar.startEngine();
        electricCar.drive();

        CarSkeleton hybridCar = new HybridCar("HybridCar", "Dual mode", 20.0, 60, 4);
        hybridCar.startEngine();
        hybridCar.drive();
    }
}
