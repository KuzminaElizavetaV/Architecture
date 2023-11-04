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

    protected NotesRecord searchRecord(int id) {
        for (NotesRecord record : records) {
            if (record.getId() == id)
                return record;
        }
        return null;
    }

    protected void changeNotesRecord(int id, String title, String details) {
        NotesRecord record = searchRecord(id);
        if (record != null) {
            record.setTitle(title);
            record.setDetails(details);
        }
        else throw new RuntimeException("Запись не найдена");
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
