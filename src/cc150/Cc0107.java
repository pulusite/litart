package cc150;

/**
 * Created by zhangdong on 1/1/18.
 */
public class Cc0107 {
    public void setZeros(int[][] matrix){
        boolean[] row=new boolean[matrix.length];
        boolean[] column=new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || column[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
