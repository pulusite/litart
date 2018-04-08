package leetcode;

/**
 * Created by zhangdong on 2017/12/20.
 *
 * Linked List Cycle
 *
 * Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?
 */
public class Leet141 {
    public boolean hasCycle(ListNode head) {
        if (head==null) return false;
        ListNode slow=head,fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leet141 leet = new Leet141();
        ListNode listNode=new ListNode(1);
        System.out.println(leet.hasCycle(listNode));
    }
}
