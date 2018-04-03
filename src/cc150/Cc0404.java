package cc150;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by zhangdong on 8/23/17.
 * <p>
 * 二叉树，创建含有某一深度上所有结点的链表
 */
public class Cc0404 {
    void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
        if (root== null) return;

        LinkedList<TreeNode> list = null;
        if (list.size()==level){
            list= new LinkedList<TreeNode>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
    }
}
