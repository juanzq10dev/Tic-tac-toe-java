package tictactoe.game;

import tictactoe.board.Board;
import tictactoe.board.ClassicBoard;
import tictactoe.gamecontrollers.TurnController;
import tictactoe.gamecontrollers.WinController;

public class GameController {
    private final int BOARD_LENGTH;
    private Board board;
    private WinController winController;
    private TurnController turnController;

    public GameController(int[][] gameBoard, int boardLength) {
        this.BOARD_LENGTH = boardLength;
        this.board = new ClassicBoard(gameBoard, boardLength);
        this.winController = new WinController(gameBoard, boardLength);
        this.turnController = new TurnController(boardLength);
    }

    public boolean tryMark(int x, int y) {
        if (board.mark(x, y, turnController.getCurrPlayer())) {
            turnController.updateCurrentTurn();
            return true;
        }

        return false;
    }

    public int changePlayerTurn() {
        return turnController.changePlayersTurn();
    }

    public int getCurrPlayer() {
        return turnController.getCurrPlayer();
    }

}
