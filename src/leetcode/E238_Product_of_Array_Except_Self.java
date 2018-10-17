package leetcode;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/9/30.
 */
public class E238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;

        for (int i = 1; i < n; i++) {
            res[i]=res[i-1]*nums[i-1];
        }

        int right=1;
        for (int i = n-1; i >= 0; i--) {
            res[i]*=right;
            right*=nums[i];
        }

        return res;
    }

    @Test
    public void test(){
        int[] nums={2,3,4};

        int[] res=productExceptSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
