package com.year2018.january.fourthweek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// N皇后问题，给出所有的解决方案。dfs 深度优先搜索

/**
 * @author hawken
 */
public class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res);
        return res;
    }

    private void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if (colIndex == board.length) {
            res.add(construct(board));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.';
            }
        }
    }

    private boolean validate(char[][] board, int x, int y) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < y; j++) {

                 // 判断条件,详见网友分析
                if (board[i][j] == 'Q' && (x == i || x + j == y + i || x + y == i + j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 将 char 数组转化成 string list
     */
    private List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
