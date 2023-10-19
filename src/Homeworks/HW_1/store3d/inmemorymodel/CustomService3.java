package Homeworks.HW_1.store3d.inmemorymodel;

public class CustomService3 implements ModelChangedObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("Реагирует на изменение в хранилище моделей");
    }
}