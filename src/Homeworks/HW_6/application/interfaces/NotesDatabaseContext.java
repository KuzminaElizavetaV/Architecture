package Homeworks.HW_6.application.interfaces;



import Homeworks.HW_6.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {
    //region Новые методы
    void create(String title, String details);
    Note read(int noteID);
    void update(int noteID, String title, String details);
    void delete(int noteID);
    //endregion

    Collection<Note> getAll();
    boolean saveChanges();


}
