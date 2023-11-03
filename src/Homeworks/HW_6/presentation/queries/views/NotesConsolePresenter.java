package Homeworks.HW_6.presentation.queries.views;


import Homeworks.HW_6.application.interfaces.NotesPresenter;
import Homeworks.HW_6.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
    }

    @Override
    public void printNote(Note note) {
        System.out.println(note);
    }
}
