public class SudokuSolver {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = row / 3 * 3;
        int sc = col / 3 * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int newRow, newCol;
        if (col != board.length - 1) {
            newRow = row;
            newCol = col + 1;
        } else {
            newRow = row + 1;
            newCol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, newRow, newCol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, newRow, newCol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        char[][] board = {
                {'9', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '2', '.', '.', '.', '8', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.', '.', '.', '7', '.'},
                {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '4', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '1', '.', '.'}
        };

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);

        System.out.println("Solved Sudoku:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
