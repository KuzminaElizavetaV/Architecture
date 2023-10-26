package Homeworks.HW_3;

import Homeworks.HW_3.cars.Car;
import Homeworks.HW_3.cars.Crossover;
import Homeworks.HW_3.cars.Harvester;
import Homeworks.HW_3.cars.StationWagon;
import Homeworks.HW_3.carservices.CarTireService;
import Homeworks.HW_3.carwashes.CarClass;
import Homeworks.HW_3.carwashes.CarWash;
import Homeworks.HW_3.carwashes.CarWashStation;
import Homeworks.HW_3.carwashes.WashType;
import Homeworks.HW_3.refuelings.RefuelingStation;
import Homeworks.HW_3.refuelings.RefuelingStationV2;

import java.awt.*;

public class Program {

    /**
     * 1. Спроектировать абстрактный класс «Car» у которого должны
     * быть свойства: марка, модель, цвет, тип кузова, число колёс, тип
     * топлива, тип коробки передач, объём двигателя; методы:
     * движение, обслуживание, переключение передач, включение
     * фар, включение дворников.
     *
     * 2. Создать конкретный автомобиль путём наследования класса
     * «Car».
     *
     * 3. Расширить абстрактный класс «Car», добавить метод: подметать
     * улицу. Создать конкретный автомобиль путём наследования
     * класса «Car». Провести проверку принципа SRP.
     *
     * 4. Расширить абстрактный класс «Car», добавить метод:
     * включение противотуманных фар, перевозка груза. Провести
     * проверку принципа OCP.
     *
     * 5. Создать конкретный автомобиль путём наследования класса
     * «Car», определить число колёс = 3. Провести проверку принципа LSP.
     *
     * 6. Создать конкретный автомобиль путём наследования класса
     * «Car», определить метод «движение» - «полёт». Провести
     * проверку принципа LSP.
     *
     * 7. Создать интерфейс «Заправочная станция», создать метод:
     * заправка топливом.
     *
     * 8. Имплементировать метод интерфейса «Заправочная станция» в
     * конкретный класс «Car».
     *
     * 9. Добавить в интерфейс «Заправочная станция» методы: протирка
     * лобового стекла, протирка фар, протирка зеркал.
    *
     * 10. Имплементировать все методы интерфейса «Заправочная
     * станция» в конкретный класс «Car». Провести проверку
     * принципа ISP. Создать дополнительный/е интерфейсы и
     * имплементировать их в конкретный класс «Car». Провести
     * проверку принципа ISP.
     *
     * 11. Создать путём наследования класса «Car» два
     * автомобиля: с бензиновым и дизельным двигателями,
     * имплементировать метод «Заправка топливом» интерфейса
     * «Заправочная станция». Реализовать заправку каждого
     * автомобиля подходящим топливом. Провести проверку принципа DIP.

     * TODO: Домашнее задание:
     * Доработать приложение, спроектированное на семинаре. Добавить тип, описывающий "автомойку".
     * Продемонстрировать работу получившейся программы,
     * создать несколько типов автомобилей,
     * загнать каждый автомобиль на заправку, а затем и на автомойку.
     * @param args
     */
    public static void main(String[] args) {

        RefuelingStation refuelingStation = new RefuelingStation();
        RefuelingStationV2 refuelingStation2 = new RefuelingStationV2();
        CarWashStation carWashStation = new CarWashStation();
        CarTireService carTireService = new CarTireService();

        carTireService.setPriceReplaceTires(13, 375);
        carTireService.setPriceReplaceTires(14, 390);
        carTireService.setPriceReplaceTires(15, 405);
        carTireService.setPriceReplaceTires(16, 420);
        carTireService.setPriceReplaceTires(22, 550);

        carTireService.setPriceReplaceWheels(13, 300);
        carTireService.setPriceReplaceWheels(14, 320);
        carTireService.setPriceReplaceWheels(15, 340);
        carTireService.setPriceReplaceWheels(16, 360);
        carTireService.setPriceReplaceWheels(22, 450);


        Harvester harvester = new Harvester("A", "B", Color.BLACK);
        StationWagon stationWagon = new StationWagon("Lada", "Largus", Color.BLUE);
        Crossover crossover = new Crossover("Toyota", "RAV4", Color.BLACK);

        harvester.setRefuelingStation(refuelingStation2);
        harvester.fuel();
        stationWagon.setRefuelingStation(refuelingStation);
        stationWagon.fuel();
        crossover.setRefuelingStation(refuelingStation2);
        crossover.fuel();

        stationWagon.setCarWashStation(carWashStation);
        stationWagon.wash(WashType.STANDART, CarClass.Third);
        harvester.setCarWashStation(carWashStation);
        harvester.wash(WashType.COMPLEX, CarClass.Fifth);
        crossover.setCarWashStation(carWashStation);
        crossover.wash(WashType.EXPRESS, CarClass.Fourth);

        stationWagon.setCarTireService(carTireService);
        harvester.setCarTireService(carTireService);
        crossover.setCarTireService(carTireService);

        harvester.diagnostics();
        harvester.replaceTires();
        stationWagon.replaceTires();
        crossover.replaceWheels();
    }
}
