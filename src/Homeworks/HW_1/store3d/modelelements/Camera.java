package Homeworks.HW_1.store3d.modelelements;


public class Camera {
    //region Методы

    public void rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    public void move(Point3D newLocation) {
        this.location = newLocation;
    }

    //endregion


    //region Конструктор

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    //endregion


    //region Свойства

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    //endregion


    //region Поля

    private Point3D location;
    private Angle3D angle;

    //endregion
}