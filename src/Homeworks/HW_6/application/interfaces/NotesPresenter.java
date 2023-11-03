package Homeworks.HW_6.application.interfaces;



import Homeworks.HW_6.domain.Note;

import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);

    void printNote(Note note);

}
