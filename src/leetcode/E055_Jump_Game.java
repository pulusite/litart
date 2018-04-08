package leetcode;

/**
 * Created by zhangdong on 1/11/18.
 */
public class E055_Jump_Game {
    public boolean canJump(int[] nums) {
        int i = 0;
        for (int reach = 0; i < nums.length && i <= reach; ++i)
            reach = Math.max(i + nums[i], reach);
        return i == nums.length;
    }
}
