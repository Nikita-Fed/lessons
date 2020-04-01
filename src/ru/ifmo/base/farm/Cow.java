package ru.ifmo.base.farm;

public class Cow extends Pets implements GiveRes, Eatable {
    private int maxHealth = 10;



    @Override
    public int giveResources() {
        return getResSize();
    }
}
