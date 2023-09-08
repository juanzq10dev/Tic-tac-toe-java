package tictactoe.eventHandlers;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import tictactoe.board.Board;
import tictactoe.components.FxPlayerImage;
import tictactoe.components.FxRectangle;
import tictactoe.game.GameController;
import tictactoe.gamecontrollers.TurnController;

public class RectangleClickHandler {
    public static void addClickEvent(FxRectangle fxRectangle, GameController gameController, Pane pane) {
        fxRectangle.setOnMouseClicked(e -> {
            int x = fxRectangle.getXCoordinate();
            int y = fxRectangle.getYCoordinate();

            if (gameController.tryMark(x, y)) {
                FxPlayerImage playerImage = new FxPlayerImage(x, y, gameController.getCurrPlayer());
                gameController.changePlayerTurn();


                pane.getChildren().add(playerImage);
            };
        });
    }
}
