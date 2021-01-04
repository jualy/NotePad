package com.company;

import java.io.File;
import java.io.FilenameFilter;
import java.util.InputMismatchException;

public class Main {
    private static NotePad notepad = new NotePad();
    private static File notePadboardFile = new File("NotePad.txt");


    public static void main(String[] args) {
        File notePadboardFile = Main.notePadboardFile;
        boolean running = true;
        while (running) {
            var cmd = InputUtils.askString("Enter command");
            switch (cmd) {
                case "list":
                    listRecords();
                    break;
                case "create":
                    createRecord();
                    break;
                case "delete":
                    deleteRecord();
                    break;
                case "find":
                    findRecord();
                    break;
                case "help":
                    showHelp();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command");


            }
        }
        System.out.println("Good bye!");
    }

    private static void findRecord() {
        var substr = InputUtils.askString("Substring to find");
        notepad.find(substr);
    }

    private static void deleteRecord() {
        int id = InputUtils.askInt("ID");
        notepad.delete(id);
    }


    private static void listRecords() {
        notepad.listRecords();

    }


    private static void createRecord() {

        try {
            var strType = InputUtils.askString("Type");
            var type = RecordType.valueOf(strType);
            notepad.createRecord(type);


        } catch (Exception e) {
            System.out.println("Enter new command");
        }
    }


    private static void showHelp() {
        System.out.println("You can create: Book, Person, Pet, Reminder, Alarm or StickyNote. Enter create.");
    }


}







