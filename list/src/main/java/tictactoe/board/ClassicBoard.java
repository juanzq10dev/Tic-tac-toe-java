package tictactoe.board;

import java.security.PrivateKey;
import java.security.PublicKey;

public class ClassicBoard implements Board {
    private static final int BOARD_LENGTH = 3;

    private int[][] board;

    public ClassicBoard() {
        this.board = new int[BOARD_LENGTH][BOARD_LENGTH];
    }
    @Override
    public boolean mark(int x, int y, int player) {
        if (coordinateIsValid(x) && coordinateIsValid(y) && positionIsEmpty(x, y)) {
            this.board[x][y] = player;
            return true;
        }

        return false;
    }

    private boolean coordinateIsValid(int coordinate) {
        return coordinate >= 0 && coordinate < BOARD_LENGTH;
    }

    private boolean positionIsEmpty(int x, int y) {
        return this.board[x][y] == 0;
    }


}
