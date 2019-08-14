package tba.mianshi.suanfa;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by zhangdong on 2018/6/5.
 *
 * 分析：这是一道很好的考查对递归理解的编程题，
 * 因此在过去一年中频繁出现在各大公司的面试、笔试题中。
 */
public class Permutation_Dictionary {

    @Test
    public void test(){
        System.out.println(permutation("abc"));
    }
    //leetcode 递归 回溯
    public List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
//        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                System.out.println();
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    //leetcode 迭代
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (num.length ==0) return ans;
        List<Integer> l0 = new ArrayList<Integer>();
        l0.add(num[0]);
        ans.add(l0);
        for (int i = 1; i< num.length; ++i){
            List<List<Integer>> new_ans = new ArrayList<List<Integer>>();
            for (int j = 0; j<=i; ++j){
                for (List<Integer> l : ans){
                    List<Integer> new_l = new ArrayList<Integer>(l);
                    new_l.add(j,num[i]);
                    new_ans.add(new_l);
                }
            }
            ans = new_ans;
        }
        return ans;
    }

    //
    public ArrayList<String> permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();//根据返回类型需要
        if(str==null||str.length()==0){
            return result;
        }
        char[] chars = str.toCharArray();
        TreeSet<String> res = new TreeSet<String>(); //用于排序输出
        getResult(chars,0,str.length()-1,res);
        result.addAll(res) ;//添加到ArrayList
        return result ;
    }

    public void getResult(char[] chars,int start,int end,TreeSet<String> res){

        if(start==end){
            res.add(String.valueOf(chars));
        }else{
            for(int i=start;i<=end;i++){
                swap(chars,start,i);//换一位
                getResult(chars,start+1,end,res);//递归
                swap(chars,start,i);//换回来，保证下次换位是正确的
            }
        }
    }

    public void swap(char[] chars,int a,int b){
        if(a==b){//因为会出现原位置与原位置交换，直接空即可

        }else{
            char temp = chars[a];
            chars[a]=chars[b];
            chars[b]=temp;
        }
    }
}
