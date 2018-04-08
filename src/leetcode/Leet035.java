package leetcode;

/**
 * Created by zhangdong on 2017/7/19.
 */
public class Leet035 {
    public int searchInsert(int[] nums, int target) {
        int index=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<target) index+=1;
            if (nums[i]==target) return i;
            if (nums[i]>target) return index+1;
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums={1};
        int target=2;
        Leet035 leet = new Leet035();
        System.out.println(leet.searchInsert(nums,target));
    }
}
