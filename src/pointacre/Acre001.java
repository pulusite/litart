package pointacre;

/**
 * Created by dongzhang on 7/5/17.
 * Google面试题  LC原题 136
 * 给定数组，除了一个数出现一次外，所有数都出现两次。找出那个出现一次的数。。
 */
public class Acre001 {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2};
        Acre001 acre =new Acre001();
        System.out.println(acre.singleNumber(nums));
    }
}
