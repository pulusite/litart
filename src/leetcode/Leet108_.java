package leetcode;

/**
 * Created by zhangdong on 2017/9/30.
 */
public class Leet108_ {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null || nums.length==0) return null;
        TreeNode head = helper(nums,0,nums.length-1);
        return head;
    }
    private TreeNode helper(int[] nums, int low, int high){
        if (low>high){
            return null;
        }
        int mid = (low+high)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left=helper(nums,low,mid-1);
        node.right=helper(nums,mid+1,high);
        return node;
    }
}
