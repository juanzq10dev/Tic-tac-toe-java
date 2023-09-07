package tictactoe.board;

import static tictactoe.gamecontrollers.CoordinateValidator.*;

public class ClassicBoard implements Board {
    private final int BOARD_LENGTH;

    private int[][] board;

    public ClassicBoard(int[][] board, int boardLength) {
        this.board = board;
        BOARD_LENGTH = boardLength;
    }

    protected ClassicBoard() {
        this(new int[3][3], 3);
    }
    @Override
    public boolean mark(int x, int y, int player) {
        if (coordinatesAreValid(x, y, BOARD_LENGTH) && positionIsEmpty(x, y)) {
            this.board[x][y] = player;
            return true;
        }

        return false;
    }

    private boolean positionIsEmpty(int x, int y) {
        return this.board[x][y] == 0;
    }

}
