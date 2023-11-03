package Homeworks.HW_6.application;



import Homeworks.HW_6.application.interfaces.NoteEditor;
import Homeworks.HW_6.application.interfaces.NotesDatabaseContext;
import Homeworks.HW_6.application.interfaces.NotesPresenter;
import Homeworks.HW_6.domain.Note;

import java.util.Collection;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter presenter;

    public ConcreteNoteEditor(
            NotesPresenter presenter,
            NotesDatabaseContext dbContext) {
        this.dbContext = dbContext;
        this.presenter = presenter;
    }

    @Override
    public boolean add(Note item) {
        dbContext.create(item.getTitle(), item.getDetails());
        //dbContext.getAll().add(item);
        return dbContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        return false;
    }

    @Override
    public boolean remove(Note item) {
        dbContext.delete(item.getId());
        //dbContext.getAll().remove(item);
        return dbContext.saveChanges();
    }

    @Override
    public Note getById(Integer integer) {
        return dbContext.read(integer);
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        presenter.printAll(getAll());
    }

    @Override
    public void printNote(int noteID) {
        presenter.printNote(getById(noteID));
    }
}
