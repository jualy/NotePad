package com.company;


public class Pet extends Record {

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

    private String name;

    private Species species;




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
    {
        System.out.println("Enter species: CAT, DOG, FISH, OTHER and pet`s name");

    }

    }
