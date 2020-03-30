package ru.ifmo.base.farm;

public class Pets {
    private String name;
    private int weight, speed, health, maxHealth;
    private int resSize; // кол-во ресурсов, которое дает животное
    private boolean onFarm;



    public boolean canRunaway(Pets pet, WildAnimal wild) {
        return pet.getSpeed() > wild.getSpeed();
    }

    public void isRecover () {
        if (health < maxHealth)
            health++;
    }

    public void beAttacked (Pets pet, WildAnimal wild) {
        if (! canRunaway(pet, wild)) {
            pet.health -= wild.getPower();
            if (pet.health <= 0) pet.onFarm = false;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResSize() {
        return resSize;
    }

    public void setResSize(int resSize) {
        this.resSize = resSize;
    }

    public boolean isOnFarm() {
        return onFarm;
    }

    public void setOnFarm(boolean onFarm) {
        this.onFarm = onFarm;
    }
}
