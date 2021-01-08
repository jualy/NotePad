package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String birthday;


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

        var myBirthday = LocalDate.of(1978, Month.APRIL, 4);
        System.out.println("my birthday 1: " + myBirthday);
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; first name: %s; last name: %s; phone: %s; email: %s; birthday: %s;", str, firstName, lastName, phone, email, birthday);
    }

    @Override
    public void askData() {
        firstName = (InputUtils.askString("First Name"));
        lastName = (InputUtils.askString("Last Name"));
        phone = (InputUtils.askString("Phone"));
        email = (InputUtils.askString("Email"));
        birthday = (InputUtils.askString("Birthday"));
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || firstName.toLowerCase().contains(substr)
                || lastName.toLowerCase().contains(substr)
                || email.toLowerCase().contains(substr)
                || phone.toLowerCase().contains(substr)
                || birthday.toLowerCase().contains(substr);
    }
}