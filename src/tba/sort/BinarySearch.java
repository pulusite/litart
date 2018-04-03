package tba.sort;

/**
 * Created by dongzhang on 7/6/17.
 */
public class BinarySearch {
    public static int binarySearch(int[] nums, int low,int high,int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == nums[mid]) {
                return mid;
            } else if (x < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
