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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode forCount = head;
        int count=0;
        while(forCount != null){
            count++;
            forCount = forCount.next;
        }

        n = count-n;

        if (n==0) return head.next;

        ListNode temp = head;

        while(n-- != 1){
            temp = temp.next;
        }

        if (temp.next.next == null) temp.next = null;
        else temp.next = temp.next.next;

        return head;
    }
}
