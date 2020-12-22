package com.company;

import java.util.ArrayList;

public class NotePad {
    private ArrayList<Record> records = new ArrayList<>();
    private Record rec;

    public void createPerson() {
        var person = new Person();
        person.askData();
        records.add(person);
        System.out.println(person);


    }
    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);

        }
    }

    public void createBook() {
        var book = new Book();
        book.askData();
        records.add(book);
        System.out.println(book);
    }
    public void createStickyNote() {
        var stickyNote = new StickyNote();
        stickyNote.askData();
        records.add(stickyNote);

    }

    public void createRecurringAlarm() {
        var recurringAlarm = new RecurringAlarm();
        recurringAlarm.askData();
        records.add(recurringAlarm);
    }

    public void createReminder() {
        var reminder = new Reminder();
        reminder.askData();
        records.add(reminder);

    }
}
