package leetcode;

/**
 * Created by zhangdong on 2017/7/18.
 */
public class Leet026 {
    public int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        int cur=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[cur] == nums[i]){

            }else {
                nums[cur+1]=nums[i];
                cur++;
            }
        }
        return cur+1;
    }

    public static void main(String[] args) {
        int[] nums={};
        Leet026 leet = new Leet026();
        System.out.println(leet.removeDuplicates(nums));
    }
}
