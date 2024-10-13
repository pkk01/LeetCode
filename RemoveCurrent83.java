/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // if head is null dont need to check

        if (head == null) {
            return head;
        }

        // pointers for head
        ListNode prev = head;

        // pointer for next of head
        ListNode curr = head.next;

        while (curr != null) {
            if (prev.val == curr.val) {
                // we skip the element 
                prev.next = curr.next;
                curr = curr.next;
            }
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        // return head node
        return head;
    }
}