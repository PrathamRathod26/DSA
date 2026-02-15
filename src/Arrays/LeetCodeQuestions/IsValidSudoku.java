package Arrays.LeetCodeQuestions;

import java.util.*;

public class IsValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];


        for (int i = 0; i < n; i++) {
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            box[i] = new HashSet<Character>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char cell = board[i][j];
                if(cell =='.'){
                    continue;
                }
                int boxIndex = 3 * (i/3) + (j/3);

                if(row[i].contains(cell)||col[j].contains(cell)||box[boxIndex].contains(cell)){
                    return false;
                }

                row[i].add(cell);
                col[j].add(cell);
                box[boxIndex].add(cell);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        boolean result = isValidSudoku(board);
        System.out.println("Is valid sudoku: " + result);
    }
}
