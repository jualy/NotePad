package com.company;

import java.util.ArrayList;

public class NotePad {
    private ArrayList<Record> records = new ArrayList<>();

    public void createRecord() {
        var rec = new Record();
        rec.setFirstName(InputUtils.askString("First Name"));
        rec.setLastName(InputUtils.askString("Last Name"));
        rec.setPhone(InputUtils.askString("Phone"));
        rec.setPhone(InputUtils.askString("Email"));
        records.add(rec);

    }
    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);

        }
    }

    public void showListRecords() {

    }
}
