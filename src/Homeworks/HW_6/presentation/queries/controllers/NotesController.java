package Homeworks.HW_6.presentation.queries.controllers;


import Homeworks.HW_6.application.interfaces.NoteEditor;
import Homeworks.HW_6.domain.Note;

public class NotesController extends Controller {

    public void addNote(String noteTitle, String noteDetails) {
        noteEditor.add(new Note(noteTitle, noteDetails));
    }
    public void printNote(int noteID){
        noteEditor.printNote(noteID);
    }
    public void removeNote(int noteID) {
        noteEditor.remove(noteEditor.getById(noteID));
    }
    public void editNote(Note note) {
        noteEditor.edit(note);
    }

    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    //TODO: \notes\all
    public void routeGetAll(){
        noteEditor.printAll();
    }
}
