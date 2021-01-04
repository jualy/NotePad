package com.company;


public class Pet extends Record {

    private String name;
    private Species species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
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
        species = InputUtils.askSpecies("Species");

    }

    Species sp1 = Species.CAT;
    Species sp2 = Species.DOG;
    Species sp3 = Species.FISH;
    Species sp4 = Species.OTHER;

for(
    Species sp : Species.values())

    {
        System.out.println(sp);
    }
}