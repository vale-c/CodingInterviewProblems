/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
<<<<<<< HEAD
 *
 * https://leetcode.com/problems/word-search/description/
 *
 * algorithms
 * Medium (32.77%)
 * Likes:    2375
 * Dislikes: 126
 * Total Accepted:    347.4K
 * Total Submissions: 1.1M
 * Testcase Example:  '[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]\n"ABCCED"'
 *
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring. The
 * same letter cell may not be used more than once.
 * 
 * Example:
 * 
 * 
 * board =
 * [
 * ⁠ ['A','B','C','E'],
 * ⁠ ['S','F','C','S'],
 * ⁠ ['A','D','E','E']
 * ]
 * 
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 * 
 * 
=======
>>>>>>> acebdd6870314907b817ad31860a4e00390e792e
 */

// @lc code=start
class Solution {
<<<<<<< HEAD
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
=======

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)){
>>>>>>> acebdd6870314907b817ad31860a4e00390e792e
                    return true;
                }
            }
        }
        return false;
    }
<<<<<<< HEAD

=======
>>>>>>> acebdd6870314907b817ad31860a4e00390e792e
    // DFS approach
    public boolean dfs(char board[][], int i, int j, int count, String word) {
        if (count == word.length()) {
            return true;
        }

<<<<<<< HEAD
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)) {
=======
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)){
>>>>>>> acebdd6870314907b817ad31860a4e00390e792e
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

<<<<<<< HEAD
        boolean found = dfs(board, i + 1, j, count + 1, word) || dfs(board, i - 1, j, count + 1, word)
                || dfs(board, i, j + 1, count + 1, word) || dfs(board, i, j - 1, count + 1, word);
=======
        boolean found = dfs(board, i+1, j, count+1, word)
        || dfs(board, i-1, j, count+1, word)
        || dfs(board, i, j+1, count+1, word)
        || dfs(board, i, j-1, count+1, word);
>>>>>>> acebdd6870314907b817ad31860a4e00390e792e

        board[i][j] = temp;
        return found;
    }
}
<<<<<<< HEAD
=======

>>>>>>> acebdd6870314907b817ad31860a4e00390e792e
// @lc code=end

