package nandor.ledenyi.switchmatrix;

public class SwitchMatrix {

    private boolean[][] board;

    public SwitchMatrix(int size) {
        board = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = false;
            }
        }
    }

    public String toString() {
        String boardToString = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    boardToString += "1 ";
                } else {
                    boardToString += "0 ";
                }
            }
            boardToString += "\n";
        }
        return boardToString;
    }

    public void randomize() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (Math.random() > 0.5) {
                    board[i][j] = true;
                }
            }
        }
    }

    public void toggle(int x, int y) {
        if (board[x][y]) {
            board[x][y] = !board[x][y];
            if (x < board.length - 1) {
                board[x + 1][y] = !board[x + 1][y];
            }
            if (x > 0) {
                board[x - 1][y] = !board[x - 1][y];
            }
            if (y < board.length - 1) {
                board[x][y + 1] = !board[x][y + 1];
            }
            if (y > 0) {
                board[x][y - 1] = !board[x][y - 1];
            }
        }
    }

    public boolean isSolved() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
