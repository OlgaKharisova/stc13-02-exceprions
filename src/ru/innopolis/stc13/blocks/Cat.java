package ru.innopolis.stc13.blocks;

public class Cat extends Animal implements Running, Mieowing, Eating {
    public Cat(String name, Integer nLegs) {
        super(name, nLegs);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void mieow() {
        System.out.println("Mieow");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
