package com.example.learnjava;

public class Vampire extends Enemy{

    public Vampire(String name) {
        super(name, 20, 3);
    }


    @Override
    public void takingDamage(int damage) {
        int damageDone = damage / 2;
        super.takingDamage(damageDone);
    }
}
