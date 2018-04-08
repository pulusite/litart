package cc150;

import java.util.Hashtable;

/**
 * Created by zhangdong on 1/1/18.
 */
public class Cc0201 {
    public static void deleteDups(LinkedListNode n){
        Hashtable table= new Hashtable();
        LinkedListNode previous=null;
        while (n!=null){
            if (table.containsKey(n.data)){
                previous.next=n.next;
            }else {
                table.put(n.data,true);
                previous=n;
            }
            n=n.next;
        }
    }

    public static void deleteDups0(LinkedListNode head){
        if (head==null) return;

        LinkedListNode current=head;
        while (current!=null){
            LinkedListNode runner=current;
            while (runner.next!=null){
                if (runner.next.data==current.data){
                    runner.next=runner.next.next;
                }else {
                    runner=runner.next;
                }
            }
            current=current.next;
        }
    }
}
