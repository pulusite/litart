package tba.mianshi.sort;

/**
 * Created by zhangdong on 2017/12/25.
 */
public class ShellSort_ {
    public static void shellSort(int[] nums){
        int d = nums.length / 2;
        int i;
        int j;
        int temp;
        while (d >= 1) {
            for (i = d; i < nums.length; i++) {
                temp = nums[i];
                j = i - d;
                while (j >= 0 && nums[j] < temp) {
                    nums[j + d] = nums[j];
                    j = j - d;
                }
                nums[j + d] = temp;
            }
            d = d / 2;
        }
    }
}
