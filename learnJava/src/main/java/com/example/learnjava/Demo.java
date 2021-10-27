package com.example.learnjava;

public class Demo {

    public static void main(String[] args) {
//        Enemy enemy = new Enemy("Test enemy", 10, 3);
//        enemy.showInfo();
//        enemy.takingDamage(3);
//        enemy.showInfo();
//        enemy.takingDamage(11);
//        enemy.showInfo();

        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takingDamage(30);

        Vampire vlad = new Vampire("Vlad");
        vlad.showInfo();
        vlad.takingDamage(8);
        vlad.showInfo();

        VampireKing hugo = new VampireKing("Hugo");
        hugo.showInfo();
        hugo.takingDamage(12);
        hugo.showInfo();
    }
}
