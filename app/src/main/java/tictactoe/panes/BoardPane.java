package tictactoe.panes;

import javafx.scene.layout.Pane;
import tictactoe.components.FxBoard;
import tictactoe.game.GameController;

public class BoardPane {
    private Pane pane;

    public BoardPane(GameController gameController, FxBoard fxBoard) {
        this.pane = new Pane();
        fxBoard.initializeBoard(gameController, pane);
    }

    public Pane getPane() {
        return pane;
    }
}
