package illichso;

import static illichso.Result.D;

public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public String getResult() {
        for(int i = 0; i < 3; i++){
            if(board[i][0].equals(board[i][1]) &&  board[i][1].equals(board[i][2])){
                return board[i][0];
            }
        }

        for(int i = 0; i < 3; i++){
            if(board[0][i].equals(board[1][i]) &&  board[1][i].equals(board[2][i])){
                return board[0][i];
            }
        }




        return D.getValue();
    }
}
