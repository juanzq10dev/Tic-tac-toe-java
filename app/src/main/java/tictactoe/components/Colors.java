package tictactoe.components;

import javafx.scene.paint.Color;

public enum Colors {
    LIGHT("#FEB"),
    DARK("#F82");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public Color getColor() {
        return Color.valueOf(color);
    }
}
