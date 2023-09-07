package tictactoe.board;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassicBoardTest {

    @Test
    public void mark_markValidPosition() {
        Board board = new ClassicBoard();
        boolean result = board.mark(0, 0, 1);
        assertTrue(result);
    }

    @Test
    public void mark_markXPositionOutOfLimits() {
        Board board = new ClassicBoard();
        boolean result = board.mark(-1, 0, 1);
        assertFalse(result);
    }

    @Test
    public void mark_markYPositionOutOfLimits() {
        Board board = new ClassicBoard();
        boolean result = board.mark(0, -1, 1);
        assertFalse(result);
    }

    @Test
    public void mark_markNonEmptyPosition() {
        Board board = new ClassicBoard();
        board.mark(0, 0, 1);
        boolean markingSamePosition = board.mark(0, 0, 2);
        assertFalse(markingSamePosition);
    }

    @Test
    public void mark_markXPositionOutOfLimitsWithLargeValue() {
        Board board = new ClassicBoard();
        boolean result = board.mark(3, 0, 1);
        assertFalse(result);
    }

    @Test
    public void mark_markYPositionOutOfLimitsWithLargeValue() {
        Board board = new ClassicBoard();
        boolean result = board.mark(0, 3, 1);
        assertFalse(result);
    }
}
