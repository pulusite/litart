package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 11/15/17.
 *
 * Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [3,2,1].

 Note: Recursive solution is trivial, could you do it iteratively?


 */
public class Leet145 {
    public List<Integer> postorderTraversal(TreeNode root) {
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
}
