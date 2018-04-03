package leetcode;

/**
 * Created by zhangdong on 2017/11/1.
 */
public class Leet122_ {
    public int maxProfit(int[] prices) {
        if (prices==null || prices.length<=1) return 0;
        int startVal=prices[0],endVal,profit,max;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>startVal) endVal=prices[i];
            if (prices[i]<startVal) startVal=prices[i];
        }
        return 0;
    }


}
