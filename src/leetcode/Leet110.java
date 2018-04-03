package leetcode;

/**
 * Created by zhangdong on 2017/9/30.
 */
public class Leet110 {
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        return Math.abs(getHeight(root.left)-getHeight(root.right)) <=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode node){
        if (node==null){
            return 0;
        }
        if (node.right == null && node.left ==null){
            return 1;
        }
        return Math.max(getHeight(node.left),getHeight(node.right))+1;
    }

    public static void main(String[] args) {
        Leet110 leet = new Leet110();

    }
}
