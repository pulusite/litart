package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zhangdong on 11/15/17.
 *
 * Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
 \
 2
 /
 3
 return [1,2,3].

 Note: Recursive solution is trivial, could you do it iteratively?
 */
public class Leet144 {
    //迭代
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root==null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            result.add(treeNode.val);
            if (treeNode.right!=null){
                stack.push(treeNode.right);
            }
            if (treeNode.left!=null){
                stack.push(treeNode.left);
            }
        }
        return result;
    }
    //递归
    public List<Integer> preorderTraversal_(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        traverse(root,result);
        return result;
    }

    private void traverse(TreeNode root, ArrayList<Integer> result){
        if (root==null) return;
        result.add(root.val);
        traverse(root.left,result);
        traverse(root.right,result);
    }
}
