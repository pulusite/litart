package leetcode;

/**
 * Created by zhangdong on 12/27/17.
 */
public class Leet235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (!(root.val>=p.val ^ root.val<=q.val)) return root;
        else return root.val>p.val ? lowestCommonAncestor(root.right,p,q) : lowestCommonAncestor(root.left,p,q);
    }
}
