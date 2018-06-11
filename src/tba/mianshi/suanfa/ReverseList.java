package tba.mianshi.suanfa;

import org.junit.Test;


/**
 * Created by zhangdong on 2018/6/4.
 */
public class ReverseList {
    @Test
    public ListNode reverseList1(ListNode head) {
        /* iterative solution */
        ListNode newHead = null;
        ListNode p=head;
        while (p != null) {
            ListNode tmp = p.next; //暂存p下一个地址，防止变化指针指向后找不到后续的数
            p.next = newHead; //p->next指向前一个空间
            newHead = p; //新链表的头移动到p，扩长一步链表
            p = tmp; //p指向原始链表p指向的下一个空间
        }
        return newHead;
    }

    @Test
    public ListNode reverseList(ListNode head) {
        /* recursive solution */
        if(head == null || head.next == null){
            return head;
        }

        ListNode root = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return root;
    }
}
