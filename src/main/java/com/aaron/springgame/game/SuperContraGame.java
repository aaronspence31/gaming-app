package com.aaron.springgame.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
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
