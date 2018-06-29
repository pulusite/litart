package leetcode;

import org.junit.Test;

/**
 * Created by zhangdong on 1/11/18.
 *
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 Example 1:

 Input: [2,3,1,1,4]
 Output: true
 Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 Example 2:

 Input: [3,2,1,0,4]
 Output: false
 Explanation: You will always arrive at index 3 no matter what. Its maximum
 jump length is 0, which makes it impossible to reach the last index.
 */
public class E055_Jump_Game {
    public boolean canJump(int[] nums) {
        int i = 0;
        for (int reach = 0; i < nums.length && i <= reach; ++i)
            reach = Math.max(i + nums[i], reach);
        return i == nums.length;
    }

    @Test
    public void test(){
        int[] nums={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
