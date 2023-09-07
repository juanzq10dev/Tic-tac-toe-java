package tictactoe.gamecontrollers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WinControllerTest {
    private static final int BOARD_LENGTH = 3;

    private int[][] board;
    private WinController winController;

    @BeforeEach
    public void initialize() {
        this.board = new int[BOARD_LENGTH][BOARD_LENGTH];
        winController = new WinController(this.board, BOARD_LENGTH);
    }

    @Test
    public void hasWon_EmptyBoard() {
        boolean hasWon = winController.hasWon(0, 0, 1);
        assertFalse(hasWon);
    }

    @Test
    public void hasWon_horizontalWin() {
        board[1][0] = 1;
        board[2][0] = 1;
        board[0][0] = 1;

        boolean hasWon = winController.hasWon(0, 0, 1);
        assertTrue(hasWon);
    }

    @Test
    public void hasWon_verticalWin() {
        board[0][2] = 2;
        board[1][2] = 2;
        board[2][2] = 2;

        boolean hasWon = winController.hasWon(0, 2, 2);
        assertTrue(hasWon);
    }

    @Test
    public void hasWon_diagonalWinFromCorner() {
        board[0][0] = 1;
        board[1][1] = 1;
        board[2][2] = 1;

        boolean hasWon = winController.hasWon(0, 0, 1);
        assertTrue(hasWon);
    }

    @Test
    public void hasWon_diagonalWinFromOtherCorner() {
        board[2][0] = 1;
        board[1][1] = 1;
        board[0][2] = 1;

        boolean hasWon = winController.hasWon(2, 0, 1);
        assertTrue(hasWon);
    }
}
