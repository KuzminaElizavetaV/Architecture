package Homeworks.HW_6.database;


import Homeworks.HW_6.infrastructure.persistance.Database;

public class NotesDatabase implements Database {
    public void addNotesRecord(String notesTitle, String notesDetails) {
        notesTable.addRecord(notesTitle, notesDetails);
    }
    public void delNoteRecord(NotesRecord notesRecord) {
        notesTable.deleteRecord(notesRecord);
    }

    //region Свойства
    public NotesTable getNotesTable() {
        return notesTable;
    }
    //endregion

    //region Поля
    private final NotesTable notesTable = new NotesTable();
    //endregion
}
