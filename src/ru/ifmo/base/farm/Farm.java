package ru.ifmo.base.farm;

public class Farm {
    private Pets[] pets = new Pets[5];

    public void addPet (Pets pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) pets[i] = pet;
        }
    }

    Farmer farmer;
}
