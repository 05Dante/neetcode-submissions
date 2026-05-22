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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        if (head == null){
            return head;
        }
        ListNode left = head;
        ListNode right = head.next;

        while(right != null){
            if (right.val == val){
                right = right.next;
            } else {
                left.next = right;
                left = left.next;
                right = right.next;
            }
        }
        left.next = null;
        return head;
    }
}