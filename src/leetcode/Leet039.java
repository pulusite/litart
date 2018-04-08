package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2017/11/23.
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 The same repeated number may be chosen from C unlimited number of times.
 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]
 */
public class Leet039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultLst = new ArrayList<>();
        if (candidates==null || candidates.length==0) return resultLst;
        List<Integer> curLst= new ArrayList<>();
        backTrack(resultLst,curLst,candidates,target);
        return resultLst;
    }
    private void backTrack(List<List<Integer>> resultLst,List<Integer> curLst,int[] nums,int target){
    }
}
