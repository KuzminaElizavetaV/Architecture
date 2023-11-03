package Homeworks.HW_6.application.interfaces;


import Homeworks.HW_6.domain.Note;

public interface NoteEditor extends Editor<Note, Integer>{

    void printAll();

    void printNote(int noteID);

}
