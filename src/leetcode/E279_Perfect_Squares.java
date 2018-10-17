package leetcode;

import java.util.Arrays;

/**
 * Created by zhangdong on 2018/9/30.
 *
 * 完全平方数
 *
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 */
public class E279_Perfect_Squares {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 1; i <= n; ++i) {
            int min=Integer.MAX_VALUE;
            int j=1;
            while (i-j*j>=0){
                min=Math.min(min,dp[i-j*j]+1);
                ++j;
            }
            dp[i]=min;
        }
        return dp[n];
    }
}
