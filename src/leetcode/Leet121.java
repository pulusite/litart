package leetcode;

/**
 * Created by zhangdong on 2017/11/1.
 */
public class Leet121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int curMax = 0,result = 0;
        for (int i = 1; i < prices.length; i++) {
            curMax = Math.max(0, curMax + prices[i] - prices[i-1]);
            result = Math.max(curMax,result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        Leet121 leet = new Leet121();
        System.out.println(leet.maxProfit(nums));
    }
}
