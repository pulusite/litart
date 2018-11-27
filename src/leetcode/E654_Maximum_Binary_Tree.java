package leetcode;

import org.junit.Test;

/**
 * Created by zhangdong on 9/13/18.
 */
public class E654_Maximum_Binary_Tree {

    @Test
    public void test(){
        int[] nums={3,2,1,6,0,5};
        System.out.println(constructMaximumBinaryTree(nums));
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int index=getMaxIndex(nums,0,nums.length-1);
        TreeNode root=new TreeNode(nums[index]);
        root.left=helper(nums,0,index-1);
        root.right=helper(nums,index+1,nums.length-1);
        return root;
    }

    private int getMaxIndex(int nums[], int left, int right){
        int max=nums[left];
        int index=left;
        for(int i=left+1;i<=right;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }

    private TreeNode helper(int[] nums, int left, int right){
        if(left>right) return null;
        int index=getMaxIndex(nums,left,right);
        TreeNode node=new TreeNode(nums[index]);
        node.left=helper(nums,left,index-1);
        node.right=helper(nums,index+1,right);
        return node;
    }
}
