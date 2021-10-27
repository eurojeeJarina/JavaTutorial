package com.example.learnjava;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;


    public Player() {
        this("Unknown Player");
    }

    public Player(String nameOfThePlayer) {
        this(nameOfThePlayer, 1);
    }

    public Player(String nameOfThePlayer, int startingLevel) {
//        this.playerName = nameOfThePlayer;
//        this.lives = 3;
//        this.level = startingLevel;
//        this.score = 0;
        setPlayerName(nameOfThePlayer);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        //setDefaultWeapon();
        inventory = new ArrayList<>();
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String nameOfThePlayer) {
        if (nameOfThePlayer.length() < 4) {
            System.out.println("The name " + nameOfThePlayer + " too short must be 4 or more.");
            return;
        }
        this.playerName = nameOfThePlayer;

    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public void setNameAndLevel(String name, int level) {
        setPlayerName(name);
        setLevel(level);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }
//
//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    public void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }
    public boolean dropLoot(Loot loot){

        if(this.inventory.contains(loot)){
            inventory.remove(loot);
            return true;
        }
        return false;


    }

    public void showInventory(){

        for(Loot item : inventory){
            System.out.println(item.getName());
        }
        System.out.println("-----------------------------");
    }
}
