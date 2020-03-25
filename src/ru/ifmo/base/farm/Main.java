package ru.ifmo.base.farm;

public class Main {
    private WildAnimal[] wildAnimals = new WildAnimal[5];

    public void addWildA (WildAnimal wildAnimal) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) wildAnimals[i] = wildAnimal;
        }
    }


    public static void main(String[] args) {

    }
}
