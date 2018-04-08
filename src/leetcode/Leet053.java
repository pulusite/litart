package leetcode;

/**
 * Created by zhangdong on 8/17/17.
 */
public class Leet053 {
    public int maxSubArray(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        int maxSum=nums[0];
        for (int i = 0; i < nums.length; i++) {
            int tempSum=nums[i];
            if (i== nums.length-1 && maxSum<tempSum){
                maxSum=tempSum;
            }
            for (int j = i+1; j < nums.length; j++) {
                tempSum=tempSum+nums[j];
                if (maxSum<tempSum){
                    maxSum=tempSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Leet053 leet = new Leet053();
        int[] nums = {-2,1};
        System.out.println(leet.maxSubArray(nums));
    }
}
