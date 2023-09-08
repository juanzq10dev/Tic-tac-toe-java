package tictactoe.components;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import static tictactoe.components.Colors.*;

public class FxRectangle extends Rectangle {
    public final static int BOX_SIZE = 100;

    private int x;
    private int y;

    public FxRectangle(boolean light, int x, int y) {
        setWidth(BOX_SIZE);
        setHeight(BOX_SIZE);
        this.x = x;
        this.y = y;

        relocate(x * BOX_SIZE, y * BOX_SIZE);
        this.setFill(getColor(light));
    }

    private Color getColor(boolean light) {
        return light ? LIGHT.getColor() : DARK.getColor();
    }

    public int getXCoordinate() {
        return x;
    }

    public int getYCoordinate() {
        return y;
    }

}
