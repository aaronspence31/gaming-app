package com.aaron.springgame;

import com.aaron.springgame.game.GameRunner;
import com.aaron.springgame.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGameApplication {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
//		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

		SpringApplication.run(SpringGameApplication.class, args);
	}

}
