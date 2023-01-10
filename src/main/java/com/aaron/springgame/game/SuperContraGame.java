package com.aaron.springgame.game;

public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Go up");
    }

    public void down() {
        System.out.println("Sit");
    }

    public void left() {
        System.out.println("Back up");
    }

    public void right() {
        System.out.println("Shoot");
    }
}
