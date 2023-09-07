package tictactoe.gamecontrollers;

public class TurnController {
    private int currPlayer;

    public TurnController() {
        this.currPlayer = 1;
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
}
