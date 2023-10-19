package Homeworks.HW_1.store3d.modelelements;

public class Texture {
    //region Конструктор
    public Texture(String name)
    {
        this.name = name;
    }
    //endregion

    //region Свойства
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    //endregion

    //region Поля
    private int id;

    private String name;
    //endregion
}
