package leetcode.explore.recursion;

public class RecursiveList {

    public ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            if (head.next.next != null) {
                ListNode tmp = head.next;
                head.next = swapPairs(tmp.next);
                tmp.next = head;
                return tmp;
            }
            ListNode tmp1 = head.next;
            ListNode tmp2 = head;
            head = tmp1;
            tmp1.next = tmp2;
            tmp1.next.next = null;
            return head;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        RecursiveList rs = new RecursiveList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        rs.swapPairs(head);
    }
}
