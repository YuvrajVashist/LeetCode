class Solution {
    boolean rec(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;

        }
        if (i >= board.length || j >= board[0].length
         || i < 0 || j < 0) {
            return false;
        }

        if (board[i][j] != word.charAt(index)) {
            return false;
        }
        char ch = board[i][j];
        board[i][j] = '$';

        //recursion
        boolean found =  rec(board, word, i, j - 1, index + 1) ||
                rec(board, word, i, j + 1, index + 1) ||
                rec(board, word, i - 1, j, index + 1) ||
                rec(board, word, i + 1, j, index + 1);
        //backtrack
        board[i][j] = ch;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    //recursion
                   if( rec(board, word, i, j, 0)){
                    return true;
                   }
                }
            }
        }
        return false;
    }
}