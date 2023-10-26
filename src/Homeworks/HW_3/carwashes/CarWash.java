package Homeworks.HW_3.carwashes;

import Homeworks.HW_3.cars.CarType;

/**
 * Автомойка
 */
public interface CarWash {
    /**
     * Мыть машину
     */
    void wash(WashType washType, CarClass carClass);
}
