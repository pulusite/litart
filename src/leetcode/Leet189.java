package leetcode;

/**
 * Created by zhangdong on 2017/10/30.
 */
public class Leet189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        if (nums==null || nums.length==0 || nums.length==1){
            return;
        }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Leet189 leet = new Leet189();
        int[] nums = {1,2,3,4,5,6,7};
        leet.rotate(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
