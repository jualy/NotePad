package com.company;

import java.util.InputMismatchException;

public class Main {
    private static NotePad notepad = new NotePad();

    public static void main(String[] args) {
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


    private static void listRecords() {
        notepad.listRecords();

    }


    private static void createRecord() {
        var strType = InputUtils.askString("Type");
        var type = RecordType.valueOf(strType);
        notepad.createRecord(type);




    }
    private static void showHelp() {
        System.out.println("You can create: Book, Person, Pet, Reminder, Alarm or StickyNote. Enter create.");
    }


}







