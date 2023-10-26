package Homeworks.HW_3.carservices;

/**
 * Шиномонтаж
 */
public interface TireService {
    /**
     * Диагностика
     */
    void diagnostics();

    /**
     * Ремонт шин
     */
    void repairTires(int wheelsCount, int radiusWheel, TypeRepair typeRepair);

    /**
     * Заменить колеса (в сборе)
     */
    void replaceWheels(int wheelsCount, int radiusWheel);

    /**
     * Заменить шины
     */
    void replaceTires(int wheelsCount, int radiusWheel);

}
