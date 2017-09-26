package controllers;

import utils.TypeOfGame;

public class ControllerTypeOfGame {
    private TypeOfGame type;

    public ControllerTypeOfGame() {
        type = new TypeOfGame();
    }

    public boolean valid(String data) {

        return this.type.isIn(data);
    }

    public void SetMode(String playMode) {
        this.type.SetType(playMode);
    }

    public String GetTypeOfGame() {
        return type.getType();
    }
}
