package cc150;

/**
 * Created by zhangdong on 8/20/17.
 */
public class Cc0401 {
    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right)) + 1;
    }

    public static boolean isBalanced(TreeNode root){
        if(root== null){
            return true;
        }
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff)>1){
            return false;
        }else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
}
