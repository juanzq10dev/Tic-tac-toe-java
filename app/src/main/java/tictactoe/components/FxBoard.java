package tictactoe.components;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import tictactoe.eventHandlers.RectangleClickHandler;
import tictactoe.game.GameController;

public class FxBoard {
    private static final int BOARD_LENGTH = 3;

    public FxBoard() { }

    public void initializeBoard (GameController gameController, Pane pane) {
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                FxRectangle rectangle = new FxRectangle((i + j) % 2 == 0, i, j);
                RectangleClickHandler.addClickEvent(rectangle, gameController, pane);
                pane.getChildren().add(rectangle);
            }
        }
    }
}
