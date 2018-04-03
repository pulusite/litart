package cc150;

/**
 * Created by zhangdong on 2018/1/2.
 */
public class Cc0203 {
    public static boolean deleteNode(LinkedListNode n){
        if (n==null || n.next==null){
            return false;
        }
        LinkedListNode next=n.next;
        n.data=next.data;
        n.next=next.next;
        return true;
    }
}
