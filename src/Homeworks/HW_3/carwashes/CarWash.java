package Homeworks.HW_3.carwashes;

import Homeworks.HW_3.Cars.CarType;
import Homeworks.HW_3.Refuelings.FuelType;

/**
 * Автомойка
 */
public interface CarWash {
    /**
     * Мыть машину
     */
    void wash(WashType washType, CarType carType);
}
