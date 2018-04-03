package cc150;

/**
 * Created by zhangdong on 1/1/18.
 * 12
 * 34
 * 1:rc=r+1c
 * 2:rc=rc-1
 * 3:rc=rc+1
 * 4:rc=r-1c
 */
public class Cc0106 {
    public void rotate(int[][] matrix,int n){
        for (int layer = 0; layer < n/2; ++layer) {
            int first=layer;
            int last=n-1-layer;
            for (int i = first; i < last; ++i) {
                int offset=i-first;
                //存储上面
                int top=matrix[first][i];
                //左到上
                matrix[first][i]=matrix[last-offset][first];
                //下到左
                matrix[last-offset][first]=matrix[last][last-offset];
                //右到下
                matrix[last][last-offset]=matrix[i][last];
                //上到右
                matrix[i][last]=top;
            }
        }
    }
}
