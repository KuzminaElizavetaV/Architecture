package Homeworks.HW_3.refuelings;

public class RefuelingStation implements Refueling{

    public void processFuel(FuelType fuelType) {
        switch (fuelType){
            case DIESEL -> System.out.println("Заправка дизельным топливом");
            case PETROL -> System.out.println("Заправка бензином");
        }
    }

    @Override
    public void fuel(FuelType fuelType) {
        processFuel(fuelType);
    }
}
