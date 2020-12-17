package com.company;

import java.util.ArrayList;

public class NotePad {
    private ArrayList<Record> records = new ArrayList<>();

    public void createRecord() {
        var rec = new Record();
        rec.setFirstName(InputUtils.askString("First Name"));
        rec.setPhone(InputUtils.askString("Phone"));
        records.add(rec);

    }
    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);

        }
    }

}
