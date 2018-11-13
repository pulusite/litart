package leetcode;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/8/16.
 */
public class E206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return null;

        ListNode newHead=null;

        return newHead;
    }

    public ListNode reverseList1(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode nextNode=head.next;
        ListNode newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;
    }



    public ListNode reverseList2(ListNode head) {
        /* recursive solution */
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }

    @Test
    public void test(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        ListNode newHead=reverseList(head);
        while (newHead!=null){
            System.out.print(newHead.val+" ");
            newHead=newHead.next;
        }
    }
}
