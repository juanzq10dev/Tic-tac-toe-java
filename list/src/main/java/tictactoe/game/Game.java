package tictactoe.game;

import tictactoe.board.Board;
import tictactoe.board.ClassicBoard;
import tictactoe.gamecontrollers.WinController;

public class Game {
    private final int BOARD_LENGTH;
    private Board board;
    private WinController winController;

    public Game(int[][] gameBoard, int boardLength) {
        this.BOARD_LENGTH = boardLength;
        this.board = new ClassicBoard(gameBoard, boardLength);
        this.winController = new WinController(gameBoard, boardLength);
    }


}
