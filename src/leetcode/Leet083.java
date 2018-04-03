package leetcode;

/**
 * Created by zhangdong on 9/26/17.
 */
public class Leet083 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode index =head;
        while (index.next!=null){
            if (index.next.val==index.val && index.next.next!=null){
                index.next=index.next.next;
            }else if (index.next.val==index.val && index.next.next==null){
                index.next=null;
            }else {
                index=index.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Leet083 leet = new Leet083();
        ListNode head = new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(3);
        head=null;
        ListNode result = leet.deleteDuplicates(head);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
