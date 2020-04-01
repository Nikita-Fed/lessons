package ru.ifmo.base.farm;

public class Farmer {
int resources = 5;
    public Farmer() {}

    Farm farm = new Farm();

    public void getRes() { //Собирать ресурсы
        int countEatable = 0;
        for (Pets pet: farm.pets) {
            if (pet instanceof GiveRes) {
                resources += pet.getResSize();
                countEatable++;
            }
        }
        if (countEatable == 0) {
            for (Pets pet: farm.pets) {
                if (pet instanceof Eatable) {
                    resources += pet.getWeight();
                    pet.setOnFarm(false);
                }
            }
        }
    }

    public void feedPets() {
        for (Pets pet: farm.pets) {
            if (pet.isOnFarm() && pet.getHealth()!= pet.getMaxHealth()) pet.setHealth(pet.getHealth()+1);
        }
    }


}
