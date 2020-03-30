package ru.ifmo.base.farm;

public class Main {

    public void passDay() {

    }


    public static void main(String[] args) {
        Pets cow = new Cow();
        cow.setName("Burenka");
        cow.setWeight(30);
        cow.setSpeed(4);
        cow.setHealth(25);
        cow.setResSize(6);

        Pets cat = new Cat();
        cat.setName("Murzik");
        cat.setWeight(4);
        cat.setSpeed(10);
        cat.setHealth(4);
        cat.setResSize(0);

        Pets chicken = new Chicken();
        chicken.setName("Ryaba");
        chicken.setWeight(7);
        chicken.setSpeed(7);
        chicken.setHealth(6);
        chicken.setResSize(2);

        Pets rabbit = new Rabbit();
        rabbit.setName("Gena");
        rabbit.setWeight(5);
        rabbit.setSpeed(12);
        rabbit.setHealth(5);
        rabbit.setResSize(0);

        Farm farm = new Farm();

        farm.addPet(cow);
        farm.addPet(cat);
        farm.addPet(chicken);
        farm.addPet(rabbit);

        WildAnimal wolf = new Wolf();
        wolf.setName("Volchara");
        wolf.setWeight(9);
        wolf.setSpeed(8);
        wolf.setPower(4);

        WildAnimal bear = new Bear();
        bear.setName("ZloyVinni");
        bear.setWeight(25);
        bear.setSpeed(7);
        bear.setPower(10);

        WildAnimal fox = new Fox();
        fox.setName("Alisa");
        fox.setWeight(6);
        fox.setSpeed(7);
        fox.setPower(3);

        farm.addWild(wolf);
        farm.addWild(bear);
        farm.addWild(fox);


    }
}
