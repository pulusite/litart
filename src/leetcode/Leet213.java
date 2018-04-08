package leetcode;

/**
 * Created by zhangdong on 2/7/18.
 */
public class Leet213 {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int len=nums.length;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0],nums[1]);
        int[] dp=new int[len];
        dp[0]=Math.max(nums[0],nums[len-1]);
        dp[1]=Math.max(dp[0],nums[1]+nums[len-1]);
        for(int i=2;i<len;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[len-1];
    }

    public static void main(String[] args) {
        Leet213 leet213=new Leet213();
        int[] nums={1,2,3};
        leet213.rob(nums);

    }
}
