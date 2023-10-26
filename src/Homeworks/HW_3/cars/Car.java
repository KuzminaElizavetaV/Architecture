package Homeworks.HW_3.cars;

import Homeworks.HW_3.carservices.TireService;
import Homeworks.HW_3.carservices.TypeRepair;
import Homeworks.HW_3.carwashes.CarClass;
import Homeworks.HW_3.carwashes.CarWash;
import Homeworks.HW_3.carwashes.WashType;
import Homeworks.HW_3.refuelings.FuelType;
import Homeworks.HW_3.refuelings.Refueling;

import java.awt.*;

public abstract class Car {

    private Refueling refueling;
    private CarWash carWash;
    private TireService tireService;
    private CarClass carClass;
    private WashType washType;


    // rerion Заправить ато

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }
    // endregion

    // region Помыть авто

    public void setCarWashStation(CarWash carWashStation) {
        this.carWash = carWashStation;
    }

    public void wash(WashType washType, CarClass carClass) {
        if (carWash != null){
            carWash.wash(washType, carClass);
        }
    }
    // endregion

    // region Шиномонтаж

    public void setCarTireService(TireService tireService) {
        this.tireService = tireService;
    }

    public void replaceTires() {
        if (this.tireService != null) {
            this.tireService.replaceTires(this.wheelsCount, this.wheelRadius);
        }
    }

    public void replaceWheels() {
        if (this.tireService != null) {
            this.tireService.replaceWheels(this.wheelsCount, this.wheelRadius);
        }
    }

    public void repairTires(TypeRepair typeRepair) {
        if (this.tireService != null) {
            this.tireService.repairTires(this.wheelsCount, this.wheelRadius, typeRepair);
        }
    }

    public void diagnostics() {
        if (this.tireService != null) {
            this.tireService.diagnostics();
        }
    }
    // endregion

    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    protected void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }
    protected void setGearboxType(GearboxType gearboxType) {
        this.gearboxType =gearboxType;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    public CarType getType() {
        return type;
    }



    public int getWheelRadius() {
        return wheelRadius;
    }

    // Движение
    public abstract void movement();
    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract boolean gearShifting();
    // Включение фар
    public abstract boolean switchHeadlights();
    // Включение дворников
    public abstract boolean switchWipers();

    //region Конструкторы

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //endregion

    //region Поля

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колес
    private int wheelsCount;

    // Радиус колеса (размер)
    private int wheelRadius;

    // Тип топлива
    protected FuelType fuelType = FuelType.DIESEL;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights = false;

    //endregion

}
