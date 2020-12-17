package com.company;

public class Record {
    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Record() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String firstName) {
        this.lastName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String phone) {
        this.email = email;

    }

    @Override
    public String toString() {
        return String.format("id: %d; first name: %s", id, firstName, phone);
    }
}
