package tictactoe.gamecontrollers;

public class CoordinateValidator {
    public static boolean coordinateIsValid(int coordinate, int boardLength) {
        return coordinate >= 0 && coordinate < boardLength;
    }

    public static boolean coordinatesAreValid(int x, int y, int boardLength) {
        return coordinateIsValid(x, boardLength) && coordinateIsValid(y, boardLength);
    }
}
