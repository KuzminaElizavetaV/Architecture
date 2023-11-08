package Homeworks.HW_6;

import Homeworks.HW_6.application.ConcreteNoteEditor;
import Homeworks.HW_6.application.interfaces.NoteEditor;
import Homeworks.HW_6.application.interfaces.NotesDatabaseContext;
import Homeworks.HW_6.database.NotesDatabase;
import Homeworks.HW_6.domain.Note;
import Homeworks.HW_6.infrastructure.persistance.Database;
import Homeworks.HW_6.infrastructure.persistance.DatabaseContext;
import Homeworks.HW_6.presentation.queries.controllers.NotesController;
import Homeworks.HW_6.presentation.queries.views.NotesConsolePresenter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Database database = new NotesDatabase();
        NotesDatabaseContext context = new DatabaseContext(database);
        NotesConsolePresenter notesConsolePresenter = new NotesConsolePresenter();
        NoteEditor noteEditor = new ConcreteNoteEditor(notesConsolePresenter, context);
        NotesController notesController = new NotesController(noteEditor);
        Scanner scanner = new Scanner(System.in);
        boolean f = true;
        while (f) {
            System.out.println("=================================");
            System.out.println("******* РЕДАКТОР ЗАМЕТОК ********");
            System.out.println("=================================");
            System.out.println(" 1. Добавить заметку");
            System.out.println(" 2. Редактировать заметку");
            System.out.println(" 3. Удалить заметку");
            System.out.println(" 4. Найти заметку");
            System.out.println(" 5. Напечатать все заметки");
            System.out.println(" 0. ЗАВЕРШЕНИЕ РАБОТЫ ПРИЛОЖЕНИЯ");
            System.out.println("=================================");
            System.out.print("Пожалуйста, выберите пункт меню: ");
            if (scanner.hasNextInt()) {
                int no = scanner.nextInt();
                scanner.nextLine();
                try {
                    switch (no) {
                        case 0 -> {
                            System.out.println("Завершение работы приложения...");
                            f = false;
                        }
                        case 1 -> {
                            System.out.println("Напишите название заметки:");
                            if (scanner.hasNext()) {
                                String title = scanner.nextLine();
                                System.out.println("Напишите подробную информацию о заметке:");
                                if (scanner.hasNext()) {
                                    String details = scanner.nextLine();
                                    notesController.addNote(title, details);
                                    System.out.println("Новая заметка успешно создана");
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Введите номер (ID) заметки:");
                            if (scanner.hasNextInt()) {
                                int noteID = scanner.nextInt();
                                scanner.nextLine();
                                Note note = noteEditor.getById(noteID);
                                System.out.printf("Найдена заметка: %s\nРедактировать (да/нет)? ", note);
                                if (scanner.hasNext()) {
                                    String reply = scanner.nextLine();
                                    switch (reply) {
                                        case "да" -> {
                                            System.out.println("Отредактируйте название заметки:");
                                            if (scanner.hasNext()) {
                                                String title = scanner.nextLine();
                                                note.setTitle(title);
                                                System.out.println("Отредактируйте подробную информацию о заметке:");
                                                if (scanner.hasNext()) {
                                                    String details = scanner.nextLine();
                                                    note.setDetails(details);
                                                    notesController.editNote(note);
                                                    System.out.println("Заметка успешно отредактирована");
                                                }
                                            }
                                        }
                                        case "нет" -> System.out.println("Обратно в главное меню.");
                                        default -> System.out.println("Укажите корректный ответ -> да или нет");
                                    }
                                } else
                                    System.out.println("ID заметки указан некорректно.");
                            }

                        }
                        case 3 -> {
                            System.out.println("Введите номер (ID) заметки:");
                            if (scanner.hasNextInt()) {
                                int noteID = scanner.nextInt();
                                scanner.nextLine();
                                notesController.removeNote(noteID);
                                System.out.printf("Заметка #%d удалена\n", noteID);
                            } else
                                System.out.println("ID заметки указан некорректно.");
                        }
                        case 4 -> {
                            System.out.println("Введите номер (ID) заметки:");
                            if (scanner.hasNextInt()) {
                                int noteID = scanner.nextInt();
                                scanner.nextLine();
                                notesController.printNote(noteID);
                            } else
                                System.out.println("ID заметки указан некорректно.");
                        }
                        case 5 -> notesController.routeGetAll();

                        default -> System.out.println("Укажите корректный пункт меню.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Укажите корректный пункт меню.");
                scanner.nextLine();
            }
        }
    }
}


