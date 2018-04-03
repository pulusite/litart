package cc150;

/**
 * Created by zhangdong on 2018/1/2.
 */
public class Cc0204 {
    public LinkedListNode partition(LinkedListNode node,int x){
        LinkedListNode beforeStart=null;
        LinkedListNode afterStart=null;
        while (node!=null){
            LinkedListNode next=node.next;
            if (node.data<x){
                node.next=beforeStart;
                beforeStart=node;
            }
        }
        return null;
    }


    public LinkedListNode partition1(LinkedListNode node,int x){
        LinkedListNode beforeStart=null;
        LinkedListNode beforeEnd=null;
        LinkedListNode afterStart=null;
        LinkedListNode afterEnd=null;

        while (node!=null){
            LinkedListNode next=node.next;
            node.next=null;
            if (node.data<x){
                if (beforeStart==null){
                    beforeStart=node;
                    beforeEnd=beforeStart;
                }else {
                    beforeEnd.next=node;
                    beforeEnd=node;
                }
            }else {
                if (afterStart==null){
                    afterStart=node;
                    afterEnd=afterStart;
                }else {
                    afterEnd.next=node;
                    afterEnd=node;
                }
            }
            node=next;
        }
        if (beforeStart==null){
            return afterStart;
        }
        beforeEnd.next=afterStart;
        return beforeStart;
    }
}
