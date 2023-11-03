package Homeworks.HW_6.infrastructure.persistance;

import Homeworks.HW_6.application.interfaces.NotesDatabaseContext;
import Homeworks.HW_6.database.NotesDatabase;
import Homeworks.HW_6.database.NotesRecord;
import Homeworks.HW_6.domain.Note;
import Homeworks.HW_6.infrastructure.persistance.entityconfiguration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {

    @Override
    public void create(String notesTitle, String notesDetails) {
        ((NotesDatabase)database).addNotesRecord(notesTitle, notesDetails);
    }

    @Override
    public Note read(int noteID) {
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords())
            if (record.getId() == noteID)
                return new Note(record.getId(), record.getTitle(), record.getDetails());
        return null;
    }

    @Override
    public void updateDetails(int noteID, String text) {
        ((NotesDatabase)database).updateNotesDetails(noteID, text);
    }

    @Override
    public void updateTitle(int noteID, String text) {
        ((NotesDatabase)database).updateNotesTitle(noteID, text);
    }

    @Override
    public void delete(int noteID) {
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords())
            if (record.getId() == noteID)
                ((NotesDatabase) database).delNoteRecord(record);
    }

    public Collection<Note> getAll(){
        Collection<Note> notes = new ArrayList<>();
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
            notes.add(new Note(
                    record.getId(),
                    record.getTitle(),
                    record.getDetails()
            ));
        }
        return notes;
    }


    public DatabaseContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }
}
