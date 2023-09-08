package tictactoe.controllers;

import javafx.scene.layout.Pane;
import tictactoe.game.GameController;

public class FxMainController {
    GameController gameController;
    Pane pane;
    public FxMainController() {
        gameController = new GameController(new int[3][3], 3);
        this.pane = new Pane();
    }

    public void getBoardPane() {

    }
}
