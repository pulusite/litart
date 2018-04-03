package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2017/9/11.
 */
public class Lint015 {
    public List<List<Integer>> permute1(int[] nums) {
        ArrayList<List<Integer>> rst = new ArrayList<List<Integer>>();
        if (nums == null) {
            return rst;
        }

        if (nums.length == 0) {
            rst.add(new ArrayList<Integer>());
            return rst;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(rst, list, nums);
        return rst;
    }

    public void helper(ArrayList<List<Integer>> rst, ArrayList<Integer> list, int[] nums){
        if(list.size() == nums.length) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            helper(rst, list, nums);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Lint015 leet = new Lint015();
        int[] nums = {1,2,3};
        System.out.println(leet.permute(nums));
    }
    // Non-Recursion
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> permutations
                = new ArrayList<List<Integer>>();
        if (nums == null) {
            return permutations;
        }

        if (nums.length == 0) {
            permutations.add(new ArrayList<Integer>());
            return permutations;
        }

        int n = nums.length;
        ArrayList<Integer> stack = new ArrayList<Integer>();

        stack.add(-1);
        while (stack.size() != 0) {
            Integer last = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);

            // increase the last number
            int next = -1;
            for (int i = last + 1; i < n; i++) {
                if (!stack.contains(i)) {
                    next = i;
                    break;
                }
            }
            if (next == -1) {
                continue;
            }

            // generate the next permutation
            stack.add(next);
            for (int i = 0; i < n; i++) {
                if (!stack.contains(i)) {
                    stack.add(i);
                }
            }

            // copy to permutations set
            ArrayList<Integer> permutation = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                permutation.add(nums[stack.get(i)]);
            }
            permutations.add(permutation);
        }

        return permutations;
    }

}
