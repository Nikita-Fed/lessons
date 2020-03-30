package ru.ifmo.base.farm;

public class Farmer {
int resources = 5;
    public Farmer() {}

    Farm farm = new Farm();

    public void getRes() {
        for (Pets pet: farm.pets) {
            if (pet instanceof GiveRes)
                resources += pet.getResSize();
        }


    }
}
