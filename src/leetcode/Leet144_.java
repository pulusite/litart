package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 10/1/17.
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
public class Leet144_ {
    public List<Integer> preorderTraversal(TreeNode root) {
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

    public static void main(String[] args) {
        Leet144_ leet = new Leet144_();
        TreeNode root=new TreeNode(1);
        TreeNode left =new TreeNode(2);
        root.left=left;
        List<Integer> result = leet.preorderTraversal(root);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
