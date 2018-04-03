package leetcode;

/**
 * Created by zhangdong on 9/27/17.
 */
public class Leet088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, potision = m + n - 1;
        while (j >= 0) {
            nums1[potision--] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }
}
