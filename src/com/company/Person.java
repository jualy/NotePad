package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Person extends Record implements Scheduled {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
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
        birthday = (InputUtils.askBirthday("Birthday"));
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || firstName.toLowerCase().contains(substr)
                || lastName.toLowerCase().contains(substr)
                || email.toLowerCase().contains(substr)
                || phone.toLowerCase().contains(substr)
                || InputUtils.birthdayToString(birthday).toLowerCase().contains(substr);
    }

    @Override
    public boolean isDue() {
        var birthday = InputUtils.birthdayToString(getBirthday());
        boolean active;
        return active && birthday.now().isAfter(birthday);
    }

    @Override
    public void dismiss() {
        active = false;
    }
}