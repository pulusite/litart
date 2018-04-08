package cc150;

import java.util.List;

/**
 * Created by zhangdong8 on 2017/7/6.
 */
public class Node {
    Node next = null;
    int data;
    Enum state;
    List<Node> adjacent;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
        }
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public List<Node> getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(List<Node> adjacent) {
        this.adjacent = adjacent;
    }
}
