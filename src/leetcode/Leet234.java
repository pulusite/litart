package leetcode;

import java.util.Stack;

/**
 * Created by zhangdong on 12/27/17.
 */
public class Leet234 {
    public boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null) return true;
        Stack<ListNode> stack = new Stack<>();
        ListNode sentinel=head;
        while (sentinel!=null){
            stack.push(sentinel);
            sentinel=sentinel.next;
        }
        while (head!=null){
            if (head.val!=stack.pop().val)
                return false;
            head=head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Leet234 leet=new Leet234();
        ListNode head=new ListNode(1);
        head.next=new ListNode(0);
        head.next.next=new ListNode(1);
        System.out.println(leet.isPalindrome(head));
    }
}
