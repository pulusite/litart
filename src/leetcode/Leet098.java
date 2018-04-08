package leetcode;

/**
 * Created by zhangdong on 2017/12/22.
 * Validate Binary Search Tree
 *
 *
 Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.
 Example 1:
 2
 / \
 1   3
 Binary tree [2,1,3], return true.
 Example 2:
 1
 / \
 2   3
 Binary tree [1,2,3], return false.
 */
public class Leet098 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root,int minVal,int maxVal) {
        if (root==null) return true;
        if (root.val<=minVal || root.val>=maxVal) return false;
        return isValidBST(root.left,minVal,root.val) && isValidBST(root.right,root.val,maxVal);
    }
}
