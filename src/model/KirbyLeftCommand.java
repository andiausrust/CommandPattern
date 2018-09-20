package model;

import interfaces.Command;

public class KirbyLeftCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacter;

    public KirbyLeftCommand(KirbyCharacterReceiver kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveLeft();
    }
}
