package com.company;

import java.util.ArrayList;

public class NotePad {
    private ArrayList<Record> records = new ArrayList<>();
    private Record rec;

    public void createPerson() {
        var person = new Person();
        processRecord(person);


    }

    private void processRecord(Record rec) {
        rec.askData();
        records.add(rec);
        System.out.println("CREATED: " + rec);
    }

    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);

        }
    }

    public void createBook() {
        var book = new Book();
        processRecord(book);
    }
    public void createStickyNote() {
        var stickyNote = new StickyNote();
        processRecord(stickyNote);

    }

    public void createRecurringAlarm() {
        var recurringAlarm = new RecurringAlarm();
        processRecord(recurringAlarm);
    }

    public void createReminder() {
        var reminder = new Reminder();
        processRecord(reminder);
    }
}
