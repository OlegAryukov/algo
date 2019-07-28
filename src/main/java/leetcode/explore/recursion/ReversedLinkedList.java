package leetcode.explore.recursion;

public class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode first = head;
        ListNode reversedHead = null;
        while(first != null){
            ListNode second = first.next;
            first.next = reversedHead;
            reversedHead = first;
            first = second;
        }
        return reversedHead;
    }
}
