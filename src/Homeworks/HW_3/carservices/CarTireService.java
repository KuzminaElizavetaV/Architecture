package Homeworks.HW_3.carservices;

import java.util.HashMap;

public class CarTireService implements TireService{
    HashMap<Integer, Double> priceReplaceTires = new HashMap<>();
    HashMap<Integer, Double> priceReplaceWheels = new HashMap<>();
    HashMap<Integer, Double> priceRepairTireBySideCut = new HashMap<>();
    HashMap<Integer, Double> priceRepairTireByPatch = new HashMap<>();
    HashMap<Integer, Double> priceRepairTireByFungus = new HashMap<>();

    // region Услуги автосервиса

    @Override
    public void diagnostics() {
        System.out.println("Производим диагностику состояния шин и дисков... Стоимость услуги составит 500 руб.");

    }

    @Override
    public void repairTires(int wheelsCount, int radiusWheel, TypeRepair typeRepair) {
        switch (typeRepair) {
            case SideCut:
                if (this.priceRepairTireBySideCut.containsKey(radiusWheel)) {
                    double price = this.priceRepairTireBySideCut.get(radiusWheel);
                    double totalPrice = calculateCostService(wheelsCount, price);
                    System.out.println("Производится ремонт бокового пореза шины в количестве " + wheelsCount + " шт.," +
                            " стоимость услуги составит " + totalPrice + " руб.");
                }
                else
                    System.out.println("Радиус колеса " + radiusWheel + " не поддерживается в нашем сервисе");
                break;
            case Patch:
                if (this.priceRepairTireByPatch.containsKey(radiusWheel)) {
                    double price = this.priceRepairTireByPatch.get(radiusWheel);
                    double totalPrice = calculateCostService(wheelsCount, price);
                    System.out.println("Производится ремонт шины латкой в количестве " + wheelsCount + " шт.," +
                            " стоимость услуги составит " + totalPrice + " руб.");
                }
                else
                    System.out.println("Радиус колеса " + radiusWheel + " не поддерживается в нашем сервисе");
                break;
            case Fungus:
                if (this.priceRepairTireByFungus.containsKey(radiusWheel)) {
                    double price = this.priceRepairTireByFungus.get(radiusWheel);
                    double totalPrice = calculateCostService(wheelsCount, price);
                    System.out.println("Производится ремонт шины грибком в количестве " + wheelsCount + " шт.," +
                            " стоимость услуги составит " + totalPrice + " руб.");
                }
                else
                    System.out.println("Радиус колеса " + radiusWheel + " не поддерживается в нашем сервисе");

        }
    }


    @Override
    public void replaceWheels(int wheelsCount, int radiusWheel) {
        if (this.priceReplaceWheels.containsKey(radiusWheel)) {
            double price = this.priceReplaceWheels.get(radiusWheel);
            double totalPrice = calculateCostService(wheelsCount, price);
            System.out.println("Производится замена колес, стоимость услуги составит " + totalPrice + " руб.");
        }
        else
            System.out.println("Радиус колеса " + radiusWheel + " не поддерживается в нашем сервисе");

    }

    @Override
    public void replaceTires(int wheelsCount, int radiusWheel) {
        if (this.priceReplaceTires.containsKey(radiusWheel)) {
            double price = this.priceReplaceTires.get(radiusWheel);
            double totalPrice = calculateCostService(wheelsCount, price);
            System.out.println("Производится замена шин, стоимость услуги составит " + totalPrice + " руб.");
        }
        else
            System.out.println("Радиус колеса " + radiusWheel + " не поддерживается в нашем сервисе");

    }
    // endregion

    /**
     * Расчет стоимости услуги
     * @param wheelsCount кол-во колес
     * @param price цена за 1 ед.
     * @return общая стоимость
     */

    private double calculateCostService(int wheelsCount, double price) {
        return wheelsCount * price;
    }


    // region Создание прайс-листов на услуги автосервиса

    public void setPriceReplaceWheels(int radiusWheel, double priceReplaceTire) {
        if (this.priceReplaceTires.get(radiusWheel) != null) {
            this.priceReplaceTires.replace(radiusWheel, priceReplaceTire);
        } else {
            this.priceReplaceTires.put(radiusWheel, priceReplaceTire);
        }
    }

    public void setPriceReplaceTires(int radiusWheel, double priceReplaceWheel) {
        if (this.priceReplaceWheels.get(radiusWheel) != null) {
            this.priceReplaceWheels.replace(radiusWheel, priceReplaceWheel);
        } else {
            this.priceReplaceWheels.put(radiusWheel, priceReplaceWheel);
        }
    }

    public void setPriceRepairTireBySideCut(int radiusWheel, double priceRepairTire) {
        if (this.priceRepairTireBySideCut.get(radiusWheel) != null) {
            this.priceRepairTireBySideCut.replace(radiusWheel, priceRepairTire);
        } else {
            this.priceRepairTireBySideCut.put(radiusWheel, priceRepairTire);
        }
    }

    public void setPriceRepairTireByPatch(int radiusWheel, double priceRepairTire) {
        if (this.priceRepairTireByPatch.get(radiusWheel) != null) {
            this.priceRepairTireByPatch.replace(radiusWheel, priceRepairTire);
        } else {
            this.priceRepairTireByPatch.put(radiusWheel, priceRepairTire);
        }
    }

    public void setPriceRepairTireByFungus(int radiusWheel, double priceRepairTire) {
        if (this.priceRepairTireByFungus.get(radiusWheel) != null) {
            this.priceRepairTireByFungus.replace(radiusWheel, priceRepairTire);
        } else {
            this.priceRepairTireByFungus.put(radiusWheel, priceRepairTire);
        }
    }
    // endregion
}
