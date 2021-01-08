package com.company;

import java.time.LocalDate;

public class Reminder extends RecurringAlarm {

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public void askData() {
        super.askData();
        date = InputUtils.askDate("Date");
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; date: %s", str, InputUtils.dateToString(date));
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || InputUtils.dateToString(date).toLowerCase().contains(substr);
    }
}
