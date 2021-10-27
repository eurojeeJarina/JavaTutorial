package com.example.learnjava;

public class VampireKing extends Vampire{

    public VampireKing(String name) {
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takingDamage(int damage) {
        int damageDone = damage / 2;
        super.takingDamage(damageDone);
    }
}
