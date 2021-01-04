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


    public void delete(int id) {
        var t = System.nanoTime();
//        for (int i = 0; i < records.size(); i++) {
//            var rec = records.get(i);
//            if (rec.getId() == id) {
//                records.remove(i);
//                break;
//            }
//        }
        records.removeIf(rec -> rec.getId() == id);
        System.out.println(System.nanoTime() - t);
    }

    public void find(String substr) {
        var tmp = substr.toLowerCase();
        for (int i = 0; i < records.size(); i++) {
            var rec = records.get(i);
            if (rec.contains(tmp)) {
                System.out.println(rec);
            }
        }

    }
}


