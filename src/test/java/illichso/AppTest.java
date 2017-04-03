package illichso;

import org.junit.Test;

import static illichso.Result.D;
import static illichso.Result.O;
import static illichso.Result.X;
import static org.junit.Assert.assertEquals;

public class AppTest {
    private TicTacToe ticTacToe;


    @Test
    public void testXWinHorizontally() throws Exception {
        String[][] board = {{"X", "X", "X"}, {"O", "X", "O"}, {"O", "X", "O"}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("X won", X.getValue(), result);
    }

    @Test
    public void testXWinVertically() throws Exception {
        String[][] board = {{"X", "O", "X"}, {"X", "X", "O"}, {"X", "O", "O"}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("X won", X.getValue(), result);
    }

    @Test
    public void testOWinHorizontally() throws Exception {
        String[][] board = {{"X", "O", "X"}, {"O", "O", "O"}, {"O", "X", "O"}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("O won", O.getValue(), result);
    }

    @Test
    public void testOWinVertically() throws Exception {
        String[][] board = {{"X", "X", "O"}, {"O", "X", "O"}, {"X", "O", "O"}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("O won", O.getValue(), result);
    }

    @Test
    public void testDraw() throws Exception {
        String[][] board = {{"X", "O", "O"}, {"O", "X", "O"}, {"O", "O", "X"}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("Draw", D.getValue(), result);
    }
}
