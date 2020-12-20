package com.company;

public class RecurringAlarm extends StickyNote {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString() {

        return String.format("time: %s", time);
    }
}
