package Homeworks.HW_1.store3d.modelelements;

public class Point3D {


    //region Конструкторы

    public Point3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {}

    //endregion

    //region Свойства

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    //endregion

    //region Поля

    private double x, y, z;

    //endregion
}
