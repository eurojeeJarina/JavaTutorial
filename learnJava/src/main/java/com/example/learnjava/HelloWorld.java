package com.example.learnjava;

public class HelloWorld {

    Player newPlayer;


    public static void main(String[] args) {

      int lives = 3;
      boolean isGameover = (lives < 1);
        System.out.println(isGameover);

      if(isGameover){
          System.out.println("GAME OVER MATE");
      }else{
          System.out.println("KEEP PLAYING");
      }




    }
}