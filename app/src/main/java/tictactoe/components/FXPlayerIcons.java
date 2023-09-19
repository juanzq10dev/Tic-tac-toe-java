package tictactoe.components;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.SVGPath;
import tictactoe.playerIcons.Circle;
import tictactoe.playerIcons.Cross;

import static tictactoe.components.FxRectangle.BOX_SIZE;

public class FXPlayerIcons extends StackPane {
    public FXPlayerIcons(int x, int y, int player) {
        this.getChildren().add(getPlayerSVGPath(player));
        this.setMaxHeight(100);
        this.setMinHeight(100);
        this.setMaxWidth(100);
        this.setMinWidth(100);
        this.relocate(x * BOX_SIZE, y * BOX_SIZE);
    }

    public SVGPath getPlayerSVGPath(int player) {
        return player == 1 ? new Cross() : new Circle();
    }

}
