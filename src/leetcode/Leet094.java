package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zhangdong on 11/15/17.
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
 \
 2
 /
 3
 return [1,3,2].

 Note: Recursive solution is trivial, could you do it iteratively?
 */
public class Leet094 {
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root,result);
        return result;
    }
    private void traverse(TreeNode root,ArrayList<Integer> result){
        if (root==null) return;
        traverse(root.left,result);
        result.add(root.val);
        traverse(root.right,result);
    }
    //迭代
    public List<Integer> inorderTraversal_(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode indexRight=root;
        while (indexRight.right!=null){
            stack.push(indexRight.right);
            indexRight=indexRight.right;
        }
        stack.push(root);
        TreeNode indexLeft=root;
        while (indexLeft.left!=null){
            stack.push(indexLeft.left);
            indexLeft=indexLeft.left;
        }
        while (!stack.isEmpty()){
            result.add(stack.pop().val);
        }
        return result;
    }
}
