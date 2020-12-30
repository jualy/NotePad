package com.company;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);
    private static Species species = new Species(System.in);

    public static String askString(String message) {
        System.out.print(message +": ");
        return scanner.next();
    }

    public static Species askSpecies(String message) {
        System.out.print(message +": ");
        return scanner.next();
    }
}