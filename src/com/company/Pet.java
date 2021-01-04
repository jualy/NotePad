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

        for (Species sp : Species.values()) {
            System.out.println(sp);
        }
        species = InputUtils.askSpecies("Species");

    }

    @Override
    public boolean contains(String substr) {
        var strSpecies = String.valueOf(species);
        return super.contains(substr)
                || name.toLowerCase().contains(substr)
                || strSpecies.toLowerCase().contains(substr);


    }
}