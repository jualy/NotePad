package com.company;

public enum RecordType {
    PERSON{
        @Override
        public Record createRecord() {
            return new Person();

    },
    BOOK {
        @Override
        public Record createRecord() {
        return new Book();
    },
    NOTE{
        @Override
        public Record createRecord() {

        return new stickyNote();
    },
    ALARM{
        @Override
        public Record createRecord() {
        return new recurringAlarm();
    },
    REMINDER {
        @Override
        public Record createRecord() {
        return new Reminder();}
    };
public abstract Record createRecord();


}