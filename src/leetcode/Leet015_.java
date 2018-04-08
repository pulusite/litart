package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangdong on 2017/9/7.
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 Note: The solution set must not contain duplicate triplets.
 For example, given array S = [-1, 0, 1, 2, -1, -4],
 A solution set is:
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 */
public class Leet015_ {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len<3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Leet015_ leet = new Leet015_();
        List<List<Integer>> result = leet.threeSum(nums);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).get(0));
            System.out.print(result.get(i).get(1));
            System.out.print(result.get(i).get(2));
            System.out.println();
        }
    }
}
