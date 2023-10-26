package Homeworks.HW_3.refuelings;

public class RefuelingStationV2 implements Refueling, Wiping {

    public void processCarFuel(FuelType fuelType) {
        switch (fuelType){
            case DIESEL -> System.out.println("Заправка дизельным топливом");
            case PETROL -> System.out.println("Заправка бензином");
        }
    }
    @Override
    public void fuel(FuelType fuelType) {
        processCarFuel(fuelType);
    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }
}