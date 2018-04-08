package cc150;

import java.util.LinkedList;

/**
 * Created by zhangdong on 8/20/17.
 * <p>
 * 用有序数组创建高度最小的二叉查找树
 */
public class Cc0403 {
    TreeNode createMinimalBST(int arr[], int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimalBST(arr, start, mid - 1);
        n.right = createMinimalBST(arr, mid + 1, end);
        return n;
    }

    TreeNode createMinimalBST(int array[]) {
        return createMinimalBST(array, 0, array.length - 1);
    }
}
