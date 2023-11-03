package Homeworks.HW_6.application.interfaces;



import Homeworks.HW_6.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {
    //region Новые методы
    void create(String title, String details);
    Note read(int noteID);
    void updateTitle(int noteID, String text);
    void updateDetails(int noteID, String text);
    void delete(int noteID);
    //endregion

    Collection<Note> getAll();
    boolean saveChanges();


}
