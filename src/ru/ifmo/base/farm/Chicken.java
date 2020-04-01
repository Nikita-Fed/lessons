package ru.ifmo.base.farm;

public class Chicken extends Pets implements GiveRes, Eatable {
    private int maxHealth = 4;


    @Override
    public int giveResources() {
        return getResSize();
    }
}
