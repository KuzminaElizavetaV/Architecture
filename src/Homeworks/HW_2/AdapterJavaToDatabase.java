package Homeworks.HW_2;

public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void create() {
        createObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
