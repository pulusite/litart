package tba.mianshi.sort;

import org.junit.Test;

/**
 * Created by zhangdong on 2017/12/25.
 */
public class ShellSort_ {
    public static void shellSort(int[] nums){
        int d = nums.length / 2;
        while (d >= 1) {
            for (int i = d; i < nums.length; i++) {
                int temp = nums[i];
                int j = i - d;
                while (j >= 0 && nums[j] < temp) {
                    nums[j + d] = nums[j];
                    j = j - d;
                }
                nums[j + d] = temp;
            }
            d = d / 2;
        }
    }

    @Test
    public void test(){
        int[] nums={8,3,9,5,0,6,4,1,2,7,1};
        shellSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
