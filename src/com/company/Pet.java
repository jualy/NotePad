package com.company;


public class Pet extends Record {


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

    private String name;

    private String species;


    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; name: %s; species: %s", str, name, species);
    }

    @Override
    public void askData() {
        name = InputUtils.askString("Name");
        species = InputUtils.askSspecies("Species");

    }


}
