package Homeworks.HW_3.carwashes;


public class CarWashStation implements CarWash{
    /**
     * Просесс мойки автомобиля
     * @param washType Тип мойки
     * @param carClass Класс автомобиля
     */
    public void processWashCar(WashType washType, CarClass carClass) {
        switch (washType){
            case EXPRESS:
                switch (carClass){
                    case First -> System.out.println("Экспресс-мойка автомобиля составит 200 руб.");
                    case Second -> System.out.println("Экспресс-мойка автомобиля составит 300 руб.");
                    case Third -> System.out.println("Экспресс-мойка автомобиля составит 350 руб.");
                    case Fourth -> System.out.println("Экспресс-мойка автомобиля составит 450 руб.");
                    case Fifth -> System.out.println("Экспресс-мойка автомобиля составит 500 руб.");
                }
                break;
            case STANDART:
                switch (carClass){
                    case First -> System.out.println("Стандартная мойка автомобиля составит 500 руб.");
                    case Second -> System.out.println("Стандартная мойка автомобиля составит 700 руб.");
                    case Third -> System.out.println("Стандартная мойка автомобиля составит 900 руб.");
                    case Fourth -> System.out.println("Стандартная мойка автомобиля составит 1000 руб.");
                    case Fifth -> System.out.println("Стандартная мойка автомобиля составит 1200 руб.");
                }
                break;
            case COMPLEX:
                switch (carClass){
                    case First -> System.out.println("Комплексная мойка автомобиля составит 800 руб.");
                    case Second -> System.out.println("Комплексная мойка автомобиля составит 900 руб.");
                    case Third -> System.out.println("Комплексная мойка автомобиля составит 1200 руб.");
                    case Fourth -> System.out.println("Комплексная мойка автомобиля составит 1400 руб.");
                    case Fifth -> System.out.println("Комплексная мойка автомобиля составит 1600 руб.");
                }
        }
    }

    @Override
    public void wash(WashType washType, CarClass carClass) {
        processWashCar(washType, carClass);

    }
}
