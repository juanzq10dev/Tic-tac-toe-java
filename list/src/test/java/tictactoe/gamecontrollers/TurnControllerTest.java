package tictactoe.gamecontrollers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurnControllerTest {
    @Test
    public void testPlayer_ChangingPlayerFirstTime() {
        TurnController turnController = new TurnController();
        int result = turnController.changePlayersTurn();
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    public void testPlayer_ChangingPlayerTwice() {
        TurnController turnController = new TurnController();
        turnController.changePlayersTurn();
        int result = turnController.changePlayersTurn();
        int expected = 1;

        assertEquals(expected, result);
    }


}
