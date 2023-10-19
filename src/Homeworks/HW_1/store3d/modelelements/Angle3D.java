package Homeworks.HW_1.store3d.modelelements;

public class Angle3D {
    //region Конструкторы

    public Angle3D(double xAngle, double yAngle, double zAngle) {
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
    }

    //endregion


    //region Свойства

    public double getXAngle() {
        return xAngle;
    }

    public double getYAngle() {
        return yAngle;
    }

    public double getZAngle() {
        return zAngle;
    }

    //endregion


    //region Поля

    private final double xAngle;
    private final double yAngle;
    private final double zAngle;

    //endregion

}
