package tictactoe.gamecontrollers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurnControllerTest {
    private final static int BOARD_LENGTH = 3;

    private TurnController turnController;

    @BeforeEach
    public void setUp() {
        turnController = new TurnController(3);
    }

    @Test
    public void testPlayer_ChangingPlayerFirstTime() {
        int result = turnController.changePlayersTurn();
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    public void testPlayer_ChangingPlayerTwice() {
        turnController.changePlayersTurn();
        int result = turnController.changePlayersTurn();
        int expected = 1;

        assertEquals(expected, result);
    }

    @Test
    public void testUpdateCurrentTurn() {
        turnController.updateCurrentTurn();
        int result = turnController.updateCurrentTurn();
        int expected =  3;

        assertEquals(expected, result);
    }

    @Test
    public void allTurnsHavePassed_AllTurnsHavePassed() {
        turnController.updateCurrentTurn();
        turnController.updateCurrentTurn();
        turnController.updateCurrentTurn();
        turnController.updateCurrentTurn();
        turnController.updateCurrentTurn();
        turnController.updateCurrentTurn();
        turnController.updateCurrentTurn();
        turnController.updateCurrentTurn();

        assertTrue(turnController.allTurnsHavePassed());
    }
}
