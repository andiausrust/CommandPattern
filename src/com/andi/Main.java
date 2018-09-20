package com.andi;

import model.*;

public class Main {

    public static void main(String[] args) {

        // Create receivers
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");

        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        // Create Commands
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);


        KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
        KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
        KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
        KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);

        // Invoker
        GameBoy gameBoy = new GameBoy(marioUpCommand, marioDownCommand, marioRightCommand, marioLeftCommand);

        gameBoy.arrowDown();
    }
}
