package com.company;

import java.util.Scanner;

public class InputUtils {
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
}