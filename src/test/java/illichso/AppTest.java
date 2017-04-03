package illichso;

import org.junit.Test;

import static illichso.Result.D;
import static illichso.Result.O;
import static illichso.Result.X;
import static org.junit.Assert.assertEquals;

public class AppTest {
    private TicTacToe ticTacToe;


    @Test
    public void testXWin() throws Exception {
        char[][] board = {{'X', 'X', 'X'}, {'O', 'X', 'O'}, {'O', 'X', 'X'}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("X won", X.getValue(), result);
    }

    @Test
    public void testOWin() throws Exception {
        char[][] board = {{'X', 'O', 'X'}, {'O', 'O', 'X'}, {'O', 'X', 'O'}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("X won", O.getValue(), result);
    }

    @Test
    public void testDraw() throws Exception {
        char[][] board = {{'X', 'O', 'O'}, {'O', 'X', 'O'}, {'O', 'O', 'X'}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("X won", D.getValue(), result);
    }
}
