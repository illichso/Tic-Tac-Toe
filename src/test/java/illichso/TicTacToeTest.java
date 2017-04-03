package illichso;

import org.junit.Test;

import java.util.Arrays;

import static illichso.Result.D;
import static illichso.Result.O;
import static illichso.Result.X;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
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
    public void testXWinDiagonally() throws Exception {
        String[][] board = {{"X", "O", "X"}, {"O", "X", "O"}, {"X", "O", "X"}};
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
    public void testOWinDiagonally() throws Exception {
        String[][] board = {{"O", "X", "X"}, {"X", "O", "O"}, {"X", "X", "O"}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("O won", O.getValue(), result);
    }

    @Test
    public void testDraw() throws Exception {
        String[][] board = {{"X", "O", "X"}, {"O", "X", "X"}, {"O", "X", "O"}};
        ticTacToe = new TicTacToe(board);

        String result = ticTacToe.getResult();

        assertEquals("Draw", D.getValue(), result);
    }

    @Test
    public void testXMakesMove() throws Exception {
        String[][] board = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
        String[][] expectedBoard = {{"", "", ""}, {"", "X", ""}, {"", "", ""}};
        ticTacToe = new TicTacToe(board);

        ticTacToe.makeMove(X, 1, 1);

        assertTrue(Arrays.deepEquals(expectedBoard, ticTacToe.getBoard()));
    }

    @Test
    public void testOMakesMove() throws Exception {
        String[][] board = {{"", "", ""}, {"", "X", ""}, {"", "", ""}};
        String[][] expectedBoard = {{"", "", ""}, {"", "X", ""}, {"", "", "O"}};
        ticTacToe = new TicTacToe(board);

        ticTacToe.makeMove(O, 2, 2);

        assertTrue(Arrays.deepEquals(expectedBoard, ticTacToe.getBoard()));
    }

    @Test
    public void testOFailsToMakeMoveOnNotEmptySpot() throws Exception {
        String[][] board = {{"", "", ""}, {"", "X", ""}, {"", "", ""}};
        String[][] expectedBoard = {{"", "", ""}, {"", "X", ""}, {"", "", ""}};
        ticTacToe = new TicTacToe(board);

        ticTacToe.makeMove(O, 1, 1);

        assertTrue(Arrays.deepEquals(expectedBoard, ticTacToe.getBoard()));
    }
}
