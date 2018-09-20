package model;

import interfaces.Command;

public class MarioRightCommand implements Command {

    private MarioCharacterReceiver marioCharacter;


    public MarioRightCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveRight();
    }
}
