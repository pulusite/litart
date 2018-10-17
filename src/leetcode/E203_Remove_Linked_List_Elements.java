package leetcode;

/**
 * Created by zhangdong on 2018/8/24.
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 Output: 1->2->3->4->5
 */
public class E203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead=head;
        while (head!=null){
            if (head.val==val){
                head=head.next;
            }
            newHead.next=head.next;
            head=head.next;
            newHead=newHead.next;
        }
        return null;
    }
}
