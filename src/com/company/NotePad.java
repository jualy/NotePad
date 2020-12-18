package com.company;

import java.util.ArrayList;

public class NotePad {
    private ArrayList<Person> records = new ArrayList<>();

    public void createRecord() {
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

    public void showListRecords() {

    }

    public void createBook() {
        var book = new Book();
        book.setAuthor(InputUtils.askString("Author"));
        book.setTitle(InputUtils.askString("Title"));
        book.setIsbn(InputUtils.askString("Isbn"));
        records.add(book);
    }
}
