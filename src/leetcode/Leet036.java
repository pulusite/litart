package leetcode;

import java.util.HashSet;

/**
 * Created by zhangdong on 12/24/17.
 *
 */
//public class Leet036 {
//    public boolean isValidSudoku(char[][] board) {
//        for(int i = 0; i<9; i++){
//            HashSet<Character> rows = new HashSet<Character>();
//            HashSet<Character> columns = new HashSet<Character>();
//            HashSet<Character> cube = new HashSet<Character>();
//            for (int j = 0; j < 9;j++){
//                if(board[i][j]!='.' && !rows.add(board[i][j]))
//                    return false;
//                if(board[j][i]!='.' && !columns.add(board[j][i]))
//                    return false;
//                int RowIndex = 3*(i/3);
//                int ColIndex = 3*(i%3);
//                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
//                    return false;
//            }
//        }
//        return true;
//    }
//}
public class Leet036 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows=new HashSet<>();
            HashSet<Character> colums=new HashSet<>();
            HashSet<Character> cube=new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if (board[i][j]!='.' && !colums.add(board[j][i]))
                    return false;
                int RowIndex=3*(i/3);
                int ColIndex=3*(i%3);
                if (board[RowIndex+j/3][ColIndex+j%3]!='.' && !cube.add(board[RowIndex+j/3][ColIndex+j%3]))
                    return false;
            }
        }
        return true;
    }
}
