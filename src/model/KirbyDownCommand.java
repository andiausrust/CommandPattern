package model;

import interfaces.Command;

public class KirbyDownCommand implements Command {
    KirbyCharacterReceiver kirbyCharacter;

    public KirbyDownCommand(KirbyCharacterReceiver kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveDown();
    }
}
