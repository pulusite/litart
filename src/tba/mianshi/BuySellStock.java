package tba.mianshi;

import org.junit.Test;

/**
 * Created by zhangdong on 6/6/18.
 *
 *   [7,1,5,3,6,4]
 */
public class BuySellStock {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    @Test
    public void test(){
        int[] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
