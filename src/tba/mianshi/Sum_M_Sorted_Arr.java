package tba.mianshi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2018/6/4.
 *
 * 	一个排好序的数组，找出两数之和为m的所有组合
 */
public class Sum_M_Sorted_Arr {
    @Test
    public void test(){
        int[] nums = {1,2,2,3,3,4,5,6};
        int m = 6;
        List result=find(nums,m);
        System.out.println(result);
    }
    public List<List> find(int[] nums,int m){
        List<List> result=new ArrayList();
        int low=0,high=nums.length-1;
        while (low<high){
            if (nums[low]+nums[high]<m){
                low++;
            }else if (nums[low]+nums[high]>m){
                high--;
            }else {
                List tmp=new ArrayList();
                tmp.add(nums[low]);
                tmp.add(nums[high]);
                result.add(tmp);
                low++;
                high--;
            }
        }
        return result;
    }
}
