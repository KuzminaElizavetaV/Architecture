package Homeworks.HW_3.Refuelings;

public class RefuelingStation implements Refueling{

    public void processfuel(FuelType fuelType) {
        switch (fuelType){
            case DIESEL -> System.out.println("Заправка дизельным топливом");
            case PETROL -> System.out.println("Заправка бензином");
        }
    }

    @Override
    public void fuel(FuelType fuelType) {
        processfuel(fuelType);
    }
}
