package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputUtils {
    public static final String TIME_FORMAT = "HH:mm";
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);
    public static final String DATE_FORMAT = "dd.MM.yyyy";
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    private static final String BIRTHDAY_FORMAT = "dd.MM.yyyy";
    private static final DateTimeFormatter BIRTHDAY_FORMATTER = DateTimeFormatter.ofPattern(BIRTHDAY_FORMAT);
    private static Scanner scanner = new Scanner(System.in);


    public static String askString(String message) {
        System.out.print(message + ": ");
        return scanner.next();
    }


    static Species askSpecies(String message) {
        String strSpecies = askString(message);
        Species species = Species.valueOf(strSpecies);
        return species;

    }

    public static int askInt(String message) {
        System.out.println(message + ": ");
        return scanner.nextInt();
    }

    public static LocalTime askTime(String message) {
        System.out.println(message + "(" + TIME_FORMAT + "): ");
        var strTime = scanner.next();
        return LocalTime.parse(strTime, TIME_FORMATTER);


    }


    public static String timeToString(LocalTime time) {
        return TIME_FORMATTER.format(time);
    }

    public static LocalDate askDate(String message) {
        System.out.println(message + "(" + DATE_FORMAT + "): ");
        var strDate = scanner.next();
        return LocalDate.parse(strDate, DATE_FORMATTER);

    }

    public static String dateToString(LocalDate date) {
        return DATE_FORMATTER.format(date);
    }

    public static LocalDate askBirthday(String message) {
        System.out.println(message + "(" + BIRTHDAY_FORMAT + "): ");
        var strBirthday = scanner.next();
        return LocalDate.parse(strBirthday, BIRTHDAY_FORMATTER);


    }

    public static String birthdayToString(LocalDate birthday) {
        return BIRTHDAY_FORMATTER.format(birthday);
    }
}