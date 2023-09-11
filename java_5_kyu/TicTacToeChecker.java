package java_5_kyu;

import java.util.HashMap;
import java.util.Map;

public class TicTacToeChecker {
    public static int isSolved(int[][] board) {
        Map<Integer, Integer> plays = new HashMap<>();
        int checker = -1;
        for (int[] ints : board) {
            for (int play : ints) {
                if (plays.containsKey(play)) {
                    plays.put(play, plays.get(play) + 1);
                } else {
                    plays.put(play, 1);
                }
            }
        }
        for (Map.Entry<Integer,Integer> entry : plays.entrySet()){
            if (entry.getValue() == 5 && (entry.getKey() == 1 || entry.getKey() == 2)) {
                checker = 0;
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] == 1) {
                    checker = 1;
                }
                if (board[i][0] == 2) {
                    checker = 2;
                }
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] == 1) {
                    checker = 1;
                }
                if (board[0][i] == 2) {
                    checker = 2;
                }
            }
        }

        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
                board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if(board[1][1] == 1){
                checker = 1;
            }
            if(board[1][1] == 2){
                checker = 2;
            }
        }
        return checker;
    }

    public static void main(String[] args) {
        int[][] board = {
                {2, 2, 1},
                {1, 2, 2},
                {1, 1, 2}};
        int solution = isSolved(board);
        System.out.println(solution);
    }
}
