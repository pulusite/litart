package tba.mianshi.zd;

import org.junit.Test;

/**
 * Created by zhangdong on 6/3/18.
 */
public class SelectSort_ {
    public void selectSort(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            int min=nums[i];
//            int indexOfMin=i;
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[j]<min){
//                    min=nums[j];
//                    indexOfMin=j;
//                }
//            }
//            if (indexOfMin!=i){
//                nums[indexOfMin]=nums[i];
//                nums[i]=min;
//            }
//        }
    }
    @Test
    public void test(){
        int[] nums={8,3,9,5,0,6,4,1,2,7};
        selectSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
