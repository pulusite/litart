package tba.zd;

import org.junit.Test;

/**
 * Created by zhangdong on 5/26/18.
 */
public class InsertSort_ {
    public void insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int tmp=nums[i];
            int j;
            for (j = i-1; j >= 0 ; j--) {
                if (nums[j]>nums[j+1]){
                    nums[j+1]=nums[j];
                }else {
                    break;
                }
            }
            nums[j]=tmp;
        }
    }

    @Test
    public void test(){
        int[] nums = {8,3,9,5,0,6,4,1,2,7};
        insertSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
    }
}
