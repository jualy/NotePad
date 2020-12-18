package com.company;

public class StickyNote extends Record {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;


    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; text: %s", text);
    }
}