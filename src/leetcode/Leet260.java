package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zhangdong on 2017/12/20.
 *
 * Single Number III
 *
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

 For example:

 Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

 Note:
 The order of the result is not important. So in the above example, [5, 3] is also correct.
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class Leet260 {
    public int[] singleNumber(int[] nums) {
        if (nums==null || nums.length<=2) return nums;
        int[] result=new int[2];
        HashMap<Integer,Boolean> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])!=null && map.get(nums[i])){
                map.remove(nums[i]);
            }else {
                map.put(nums[i],true);
            }
        }
        int i=0;
        for (int num:
             map.keySet()) {
            result[i++]=num;
        }
        return result;
    }
}
