package com.company;

import java.util.Random;
import java.util.Scanner;

public class Pet extends Record {

    private String name;

    private String species;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }



        @Override
        public String toString() {
            var str = super.toString();
            return String.format("%s; name: %s; species: %s", str, name, species);
        }

        @Override
        public void askData() {
            name = InputUtils.askString("Name");
            species = InputUtils.askString("Species");

        }
    {
        System.out.println("Enter species: CAT, DOG, FISH, OTHER and pet`s name");

    }

    }
