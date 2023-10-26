package Homeworks.HW_3.cars;

import Homeworks.HW_3.refuelings.FuelType;

import java.awt.*;

public class Crossover extends Car {
    public Crossover(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
        setWheelRadius(16);
        this.fuelType = FuelType.PETROL;
        this.type = CarType.Crossover;
        setGearboxType(GearboxType.AT);
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
