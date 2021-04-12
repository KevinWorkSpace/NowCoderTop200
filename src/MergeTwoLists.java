public class MergeTwoLists {

    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode node = dummyHead;
        while (n1 != null || n2 != null) {
            if (n1 == null) {
                node.next = n2;
                break;
            }
            if (n2 == null) {
                node.next = n1;
                break;
            }
            if (n1.val < n2.val) {
                node.next = n1;
                node = node.next;
                n1 = n1.next;
            }
            else {
                node.next = n2;
                node = node.next;
                n2 = n2.next;
            }
        }
        return dummyHead.next;
    }
}
