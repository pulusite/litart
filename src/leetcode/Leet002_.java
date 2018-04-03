package leetcode;

/**
 * Created by zhangdong on 7/24/17.
 */
public class Leet002_ {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        int value = l1.val + l2.val;
        ListNode result = new ListNode(value % 10);
        result.next = addTwoNumbers(l1.next, l2.next);
        if (value >= 10) {
            result.next = addTwoNumbers(new ListNode(value / 10), result.next);
        }
        return result;
    }

    public static void main(String[] args) {
        Leet002_ leet = new Leet002_();
        ListNode l1= new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        ListNode result = leet.addTwoNumbers(l1, l2);
        while (result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
