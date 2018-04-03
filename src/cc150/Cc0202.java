package cc150;

/**
 * Created by zhangdong on 1/1/18.
 * 找出单向链表中倒数第k个结点
 */
public class Cc0202 {
    public static int nthToLast(LinkedListNode head,int k){
        if (head==null){
            return 0;
        }
        int i=nthToLast(head.next,k)+1;
        if (i==k){
            System.out.println(head.data);
        }
        return i;
    }
}
