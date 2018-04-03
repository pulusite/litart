package leetcode;

/**
 * Created by zhangdong on 2017/7/18.
 */
public class Leet027 {
    public int removeElement(int[] nums, int val) {
        if (nums==null || nums.length ==0) return 0;
        int cur=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[cur]=nums[i];
                cur++;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        Leet027 leet = new Leet027();
        int[] nums ={1,2,3};
        int val=1;
        System.out.println(leet.removeElement(nums,val));
    }
}
