package leetcode;

/**
 * Created by zhangdong on 1/20/18.
 */
public class E152_Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        if (nums==null || nums.length==0) return -1;
        int res=0;
        int next=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>=1) res*=nums[i];
            if (nums[i-1]<0 && nums[i]>0);
        }
        return res;
    }
}
