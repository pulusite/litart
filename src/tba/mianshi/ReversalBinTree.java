package tba.mianshi;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class ReversalBinTree {
    //非递归版本

    public TreeNode invertTree1(TreeNode root) {
        if(root == null) return root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
        return root;
    }

    @Test
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            final TreeNode node = stack.pop();
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }

    @Test
    public TreeNode invertTreeBFS (TreeNode root) {
        if (root == null) {
            return null;
        }
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
    //递归版本 DFS
    @Test
    public static TreeNode reverseTreeDFS(TreeNode root){
        if (root == null) {
            return null;
        }
        final TreeNode left = root.left,
                right = root.right;
        root.left = reverseTreeDFS(right);
        root.right = reverseTreeDFS(left);
        return root;
//        if (root==null) return root;
//        TreeNode temp=root.left;
//        root.left=root.right;
//        root.right=temp;
//        if (root.left!=null) invertTree(root.left);
//        if (root.right!=null) invertTree(root.right);
//        return root;
    }

//    @Test
//    public void test(){
public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(9);
        root.right= new TreeNode(8);
        reverseTreeDFS(root);
        System.out.println(root);
    }
}
