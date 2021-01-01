package com.company;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

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
        var str = super.toString();
        return String.format("%s; first name: %s; last name: %s; phone: %s; email: %s;", str, firstName, lastName, phone, email);
    }

    @Override
    public void askData() {
        firstName = (InputUtils.askString("First Name"));
        lastName = (InputUtils.askString("Last Name"));
        phone = (InputUtils.askString("Phone"));
        email = (InputUtils.askString("Email"));
    }

}