package com.aaron.springgame.game;

public class GameRunner {
    private Mario game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }


    public void run() {
        System.out.println("Running game: " + game);
    }
}
