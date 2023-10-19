package Homeworks.HW_2;

public class Program {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.create();
        database.read();
        database.update();
        database.delete();
    }
}
