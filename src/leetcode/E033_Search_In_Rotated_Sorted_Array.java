package leetcode;

/**
 * Created by zhangdong on 1/10/18.
 *
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 5 6 7 0 1 2 4

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.
 */
public class E033_Search_In_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) return mid;
            //找出递增的那段，判断有没有在递增的那段之中
            if (nums[lo] <= nums[mid]) {
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return nums[lo] == target ? lo : -1;
    }



    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        E033_Search_In_Rotated_Sorted_Array leet = new E033_Search_In_Rotated_Sorted_Array();
        System.out.println(leet.search(nums,1));
    }
}
