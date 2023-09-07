package tictactoe.gamecontrollers;

public class WinController {

    private final int BOARD_LENGTH;

    private final int[][] board;

    public WinController(int[][] board, int boardLength) {
        this.board = board;
        this.BOARD_LENGTH = boardLength;
    }

    public boolean hasWon(int x, int y, int player) {
        return checkWinConditions(x, y, player);
    }

    public boolean checkWinConditions(int x, int y, int player) {
        boolean winInRow = true;
        boolean winInColumn = true;
        boolean winInFirstDiagonal = true;
        boolean winInSecondDiagonal = true;
        boolean areValidDiagonally = areValidDiagonally(x, y);

        for (int i = 0; i < BOARD_LENGTH; i++) {
            winInRow = playerCanWin(x, i, player, winInRow);
            winInColumn = playerCanWin(i, y, player, winInColumn);

            if (areValidDiagonally) {
                winInFirstDiagonal = playerCanWin(i, i, player, winInFirstDiagonal);
                winInSecondDiagonal = playerCanWin(i, BOARD_LENGTH - 1 - i, player, winInSecondDiagonal);
            }
        }

        return winInRow || winInColumn || areValidDiagonally && (winInFirstDiagonal || winInSecondDiagonal);
    }

    private boolean playerCanWin(int x, int y, int player, boolean lastPositionWasPlayer) {
        return lastPositionWasPlayer && board[x][y] == player;
    }

    private boolean areValidDiagonally(int x, int y) {
        return x == y || x + y == board.length -  1;
    }
}
