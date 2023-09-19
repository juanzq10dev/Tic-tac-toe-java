package tictactoe.eventHandlers;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import tictactoe.board.Board;
import tictactoe.components.*;
import tictactoe.game.GameController;
import tictactoe.gamecontrollers.TurnController;

public class RectangleClickHandler {
    public static void addClickEvent(FxRectangle fxRectangle, GameController gameController, Pane pane) {
        fxRectangle.setOnMouseClicked(e -> {
            int x = fxRectangle.getXCoordinate();
            int y = fxRectangle.getYCoordinate();

            if (gameController.tryMark(x, y)) {
                StackPane stackPane = new FXPlayerIcons(x, y, gameController.getCurrPlayer());
                gameController.changePlayerTurn();

                pane.getChildren().add(stackPane);
            };
        });
    }
}
