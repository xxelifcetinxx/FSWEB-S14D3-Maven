package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> starting hybrid system...");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> driving hybrid: " + avgKmPerLitre + " km/l, battery " + batterySize + "kWh.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> combining electric + gas.");
    }
}
