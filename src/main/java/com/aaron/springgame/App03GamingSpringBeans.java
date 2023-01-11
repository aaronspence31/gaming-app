package com.aaron.springgame;

import com.aaron.springgame.game.GameRunner;
import com.aaron.springgame.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
//		var marioGame = new MarioGame();
//		var superContraGame = new SuperContraGame();
//        var pacmanGame = new PacmanGame();
//        var gameRunner = new GameRunner(pacmanGame);
//        gameRunner.run();
    }
}
