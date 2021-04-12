public class IsPail {

    public boolean isPail (ListNode head) {
        // write code here
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode h = slow.next;
        slow.next = null;
        ListNode pre = null;
        while (h != null) {
            ListNode next = h.next;
            h.next = pre;
            pre = h;
            h = next;
        }
        while (pre != null && head != null) {
            if (pre.val != head.val) return false;
            pre = pre.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        IsPail isPail = new IsPail();
        isPail.isPail(n1);
    }
}
