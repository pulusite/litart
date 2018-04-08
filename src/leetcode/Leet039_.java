package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangdong on 2017/9/18.
 */
public class Leet039_ {
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    // version 2: reuse candidates array
//        List<List<Integer>> result = new ArrayList<>();
//        if (candidates == null) {
//            return result;
//        }
//
//        List<Integer> combination = new ArrayList<>();
//        Arrays.sort(candidates);
//        helper(candidates, 0, target, combination, result);
//
//        return result;
//    }
//
//    void helper(int[] candidates,
//                int index,
//                int target,
//                List<Integer> combination,
//                List<List<Integer>> result) {
//        if (target == 0) {
//            result.add(new ArrayList<Integer>(combination));
//            return;
//        }
//
//        for (int i = index; i < candidates.length; i++) {
//            if (candidates[i] > target) {
//                break;
//            }
//
//            if (i != index && candidates[i] == candidates[i - 1]) {
//                continue;
//            }
//
//            combination.add(candidates[i]);
//            helper(candidates, i, target - candidates[i], combination, result);
//            combination.remove(combination.size() - 1);
//        }
//}

//version 3: reuse candidates array
        public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            if(candidates == null || candidates.length == 0) return result;

            ArrayList<Integer> current = new ArrayList<>();
            Arrays.sort(candidates);

            combinationSum(candidates, target, 0, current, result);

            return result;
        }

        public void combinationSum(int[] candidates, int target, int j, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
            if(target == 0){
                ArrayList<Integer> temp = new ArrayList<>(curr);
                result.add(temp);
                return;
            }

            for(int i=j; i<candidates.length; i++){
                if(target < candidates[i])
                    return;

                curr.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, curr, result);
                curr.remove(curr.size()-1);
            }
        }

        // version 1: Remove duplicates & generate a new array
//        public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> results = new ArrayList<>();
//        if (candidates == null || candidates.length == 0) {
//            return results;
//        }
//
//        int[] nums = removeDuplicates(candidates);
//
//        dfs(nums, 0, new ArrayList<Integer>(), target, results);
//
//        return results;
//    }
//
//    private int[] removeDuplicates(int[] candidates) {
//        Arrays.sort(candidates);
//
//        int index = 0;
//        for (int i = 0; i < candidates.length; i++) {
//            if (candidates[i] != candidates[index]) {
//                candidates[++index] = candidates[i];
//            }
//        }
//
//        int[] nums = new int[index + 1];
//        for (int i = 0; i < index + 1; i++) {
//            nums[i] = candidates[i];
//        }
//
//        return nums;
//    }
//
//    private void dfs(int[] nums,
//                     int startIndex,
//                     List<Integer> combination,
//                     int remainTarget,
//                     List<List<Integer>> results) {
//        if (remainTarget == 0) {
//            results.add(new ArrayList<Integer>(combination));
//            return;
//        }
//
//        for (int i = startIndex; i < nums.length; i++) {
//            if (remainTarget < nums[i]) {
//                break;
//            }
//            combination.add(nums[i]);
//            dfs(nums, i, combination, remainTarget - nums[i], results);
//            combination.remove(combination.size() - 1);
//        }
//    }
}
