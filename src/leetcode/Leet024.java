package leetcode;

/**
 * Created by zhangdong on 2017/9/8.
 */
public class Leet024 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        head = dummy;
        while (head.next != null && head.next.next != null) {
            ListNode n1 = head.next, n2 = head.next.next;
            // head->n1->n2->...
            // => head->n2->n1->...
            head.next = n2;
            n1.next = n2.next;
            n2.next = n1;

            // move to next pair
            head = n1;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
