package Homeworks.HW_1.store3d.modelelements;

import java.util.Collection;

public class Poligon {

    //region Конструкторы

    public Poligon(Collection<Point3D> points) {
        this.points = points;
    }

    public Poligon() {}

    //endregion


    //region Свойства

    public Collection<Point3D> getPoints() {
        return points;
    }

    //endregion

    //region Поля
    private Collection<Point3D> points;

    //endregion
}