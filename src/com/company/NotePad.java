package com.company;

import java.util.ArrayList;

public class NotePad {
    private ArrayList<Record> records = new ArrayList<>();
    private Record rec;

    public void createPerson() {
        var rec = new Person();
        rec.setFirstName(InputUtils.askString("First Name"));
        rec.setLastName(InputUtils.askString("Last Name"));
        rec.setPhone(InputUtils.askString("Phone"));
        rec.setEmail(InputUtils.askString("Email"));
        records.add(rec);

    }
    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);

        }
    }



    public void createBook() {
        var book = new Book();
        book.setAuthor(InputUtils.askString("Author"));
        book.setTitle(InputUtils.askString("Title"));
        book.setIsbn(InputUtils.askString("Isbn"));
        records.add(book);
    }
    public void createStickyNote() {
        var stickyNote = new StickyNote();
        stickyNote.setText(InputUtils.askString("Text"));
        records.add(stickyNote);

    }

    public void createRecurringAlarm() {
        var recurringAlarm = new RecurringAlarm();
        recurringAlarm.setTime(InputUtils.askString("Time"));
        records.add(recurringAlarm);
    }

    public void createReminder() {
        var reminder = new Reminder();
        reminder.setTime(InputUtils.askString("Date"));
        records.add(reminder);

    }
}
