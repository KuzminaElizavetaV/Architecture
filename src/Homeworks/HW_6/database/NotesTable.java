package Homeworks.HW_6.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class NotesTable {

    private void prepareRecords(){
        if (records == null){
            records = new ArrayList<>();
            int recordCount = random.nextInt(5, 11);
            for (int i = 0; i < recordCount; i++){
                records.add(new NotesRecord("title #" + (i + 1), "details #" + (i + 1)));
            }
        }
    }

    protected void addRecord(String title, String details) {
        records.add(new NotesRecord(title, details));
    }
    protected void deleteRecord(NotesRecord notesRecord) {
        records.remove(notesRecord);
    }

    //region Свойства
    public Collection<NotesRecord> getRecords() {
        prepareRecords();
        return records;
    }
    //endregion

    //region Поля
    private static final Random random = new Random();
    private Collection<NotesRecord> records;
    //endregion
}
