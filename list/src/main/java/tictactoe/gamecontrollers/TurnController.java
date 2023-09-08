package tictactoe.gamecontrollers;

import tictactoe.board.Board;

public class TurnController {
    private int currPlayer;
    private int currTurn;
    private final int maxTurns;

    public TurnController(int boardLength) {
        this.currPlayer = 1;
        this.currTurn = 1;
        this.maxTurns = (int) Math.pow(boardLength, 2);
    }

    public int changePlayersTurn() {
        if (this.currPlayer == 1) {
            this.currPlayer = 2;
            return this.currPlayer;
        }

        if (this.currPlayer == 2) {
            this.currPlayer = 1;
        }

        return this.currPlayer;
    }

    public int updateCurrentTurn() {
        this.currTurn++;
        return currTurn;
    }

    public boolean allTurnsHavePassed() {
        return currTurn == maxTurns;
    }

    public int getCurrPlayer() {
        return currPlayer;
    }
}
