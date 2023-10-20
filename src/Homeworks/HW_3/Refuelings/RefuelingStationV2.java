package Homeworks.HW_3.Refuelings;

public class RefuelingStationV2 implements Refueling {

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

}