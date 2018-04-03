package leetcode;

import java.util.Stack;

/**
 * Created by zhangdong on 2017/12/25.
 */
public class Leet098_ {
    public boolean isValidBST(TreeNode root){
        if (root==null) return true;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode pre=null;
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if (pre!=null && root.val<=pre.val) return false;
            pre=root;
            root=root.right;
        }
        return true;
    }
}
