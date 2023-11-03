package Homeworks.HW_6.database;

public class NotesRecord {

    //region Конструкторы
    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
        id = ++counter;
    }
    //endregion

    //region Свойства
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    //endregion


    //region Поля
    private static int counter = 10000;
    private final int id;
    private String title;
    private String details;
    //endregion
}
