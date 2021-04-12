import java.util.HashMap;
import java.util.HashSet;

public class CopyRandomList {

    HashMap<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (map.containsKey(head)) return map.get(head);
        if (head == null) return head;
        Node newHead = new Node(head.val);
        map.put(head, newHead);
        newHead.next = copyRandomList(head.next);
        newHead.random = copyRandomList(head.random);
        return newHead;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}