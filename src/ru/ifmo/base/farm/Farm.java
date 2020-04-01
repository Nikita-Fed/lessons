package ru.ifmo.base.farm;

public class Farm {

    public Farm() {}
    protected Pets[] pets = new Pets[4];

    public void addPet (Pets pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) pets[i] = pet;
        }
    }

    protected WildAnimal[] wildAnimals = new WildAnimal[3];

    public void addWild (WildAnimal wild) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) wildAnimals[i] = wild;
        }
    }

    Farmer farmer;
}

class Forest {

}
