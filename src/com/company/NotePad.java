package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class NotePad {
    private ArrayList<Record> records = new ArrayList<>();
    private Record rec;

    public void createRecord(RecordType recType) {
        var rec = recType.createRecord();
        rec.askData();
        records.add(rec);
        System.out.println("CREATED: " + rec);

}

    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);

        }
    }

    public void printMessage(Species species) {
        var rec = species.printMessage();
        rec.askData();
        records.add(rec);
        System.out.println("CREATED: " + rec);

    }
}

