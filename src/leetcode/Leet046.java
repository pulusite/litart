package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2/3/18.
 */
public class Leet046 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<Integer>(),nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
        if(tempList.size()==nums.length){
            list.add(new ArrayList<>(tempList));
        }else{
            for(int i=0;i<nums.length;i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(list,tempList,nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Leet046 leet046=new Leet046();
        int[] nums={1,2,3};
        leet046.permute(nums);
    }
}
