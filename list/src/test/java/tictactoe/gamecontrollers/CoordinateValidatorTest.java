package tictactoe.gamecontrollers;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CoordinateValidatorTest {

    @Test
    public void testCoordinateIsValidWithValidCoordinate() {
        int coordinate = 3;
        int boardLength = 5;
        assertTrue(CoordinateValidator.coordinateIsValid(coordinate, boardLength));
    }

    @Test
    public void testCoordinateIsValidWithNegativeCoordinate() {
        int coordinate = -1;
        int boardLength = 5;
        assertFalse(CoordinateValidator.coordinateIsValid(coordinate, boardLength));
    }

    @Test
    public void testCoordinateIsValidWithCoordinateEqualToBoardLength() {
        int coordinate = 5;
        int boardLength = 5;
        assertFalse(CoordinateValidator.coordinateIsValid(coordinate, boardLength));
    }

    @Test
    public void testCoordinatesAreValidWithValidCoordinates() {
        int x = 3;
        int y = 2;
        int boardLength = 5;
        assertTrue(CoordinateValidator.coordinatesAreValid(x, y, boardLength));
    }

    @Test
    public void testCoordinatesAreValidWithInvalidXCoordinate() {
        int x = -1;
        int y = 2;
        int boardLength = 5;
        assertFalse(CoordinateValidator.coordinatesAreValid(x, y, boardLength));
    }

    @Test
    public void testCoordinatesAreValidWithInvalidYCoordinate() {
        int x = 3;
        int y = 5;
        int boardLength = 5;
        assertFalse(CoordinateValidator.coordinatesAreValid(x, y, boardLength));
    }

    @Test
    public void testCoordinatesAreValidWithBothCoordinatesInvalid() {
        int x = -1;
        int y = 5;
        int boardLength = 5;
        assertFalse(CoordinateValidator.coordinatesAreValid(x, y, boardLength));
    }
}
