package model;

import interfaces.Command;

public class KirbyRightCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacter;

    public KirbyRightCommand(KirbyCharacterReceiver kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveRight();
    }
}
