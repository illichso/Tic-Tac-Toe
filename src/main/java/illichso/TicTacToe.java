package illichso;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import static illichso.Result.D;

@Getter
@EqualsAndHashCode
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public String getResult() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return board[i][0];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                return board[0][i];
            }
        }

        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return board[0][0];
        }

        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return board[0][2];
        }

        return D.getValue();
    }

    public void makeMove(Result player, int row, int column) {
        if (board[row][column].equals("")) {
            board[row][column] = player.getValue();
        }

    }
}
