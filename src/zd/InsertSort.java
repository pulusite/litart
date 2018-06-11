package zd;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/5/25.
 */
public class InsertSort {
    public void insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int tmp=nums[i];
            int j;
            for (j = i-1; j >=0 ; j--) {
                if (nums[j]>tmp){
                    nums[j+1]=nums[j];
                }else {
                    break;
                }
            }
            nums[j+1]=tmp;
        }
    }
    @Test
    public void test(){
        int[] nums={49,38,65,97,76,13,27,49,78,34,12,64,1};
        insertSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.println();
    }
}
