package ru.ifmo.base.farm;

public class WildAnimal {
    private String name;
    private int weight, speed, power;
    private int counter = 0;

    /*public WildAnimal(String name, int weight, int speed, int power) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.power = power;
    }*/

    public void toAttack(Pets pet, WildAnimal wild) {
        pet.beAttacked(pet, wild);
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
