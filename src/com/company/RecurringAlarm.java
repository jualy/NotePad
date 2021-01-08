package com.company;

import java.time.LocalTime;

public class RecurringAlarm extends StickyNote {

    private LocalTime time;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }


    @Override
    public void askData() {
        super.askData();
        time = InputUtils.askTime("Time");
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; time: %s", str, InputUtils.timeToString(time));
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || InputUtils.timeToString(time).toLowerCase().contains(substr);
    }
}
