package tictactoe.components;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;

import static tictactoe.components.FxRectangle.BOX_SIZE;

public class FxPlayerImage extends ImageView{
    private final static String RESOURCES_PATH = "file:src/main/resources/";

    public FxPlayerImage(int x, int y, int player) {
        this.setImage(new Image(RESOURCES_PATH + getPlayerPngName(player)));
        this.setFitWidth(BOX_SIZE);
        this.setFitHeight(BOX_SIZE);

        setPreserveRatio(true);
        setSmooth(true);
        setCache(true);

        relocate(x * BOX_SIZE, y * BOX_SIZE);
    }

    public String getPlayerPngName(int player) {
        return player == 1 ? "x.png" : "o.png";
    }
}
