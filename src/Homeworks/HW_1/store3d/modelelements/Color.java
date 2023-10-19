package Homeworks.HW_1.store3d.modelelements;

public class Color {
    //region Инициализатор и Конструктор

    {
        id = ++counter;
    }

    public Color(String name)
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

    private static int counter = 0;
    private final int id;
    private final String name;

    //endregion
}
