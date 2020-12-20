package com.company;

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
                var type = InputUtils.askString("Type");
        switch (type)  {
            case "person":
                notepad.createPerson();
                break;
            case "book":
                notepad.createBook();
                break;
            case "stickynote":
                notepad.createStickyNote();
                break;
            case "recurringalarm":
                notepad.createRecurringAlarm();
                break;
            case "reminder":
                notepad.createReminder();
                break;
            default:
                System.out.println("Unknown type");

        }

    }
    private static void showHelp() {
        System.out.println("This is very helpful help");
    }
}






