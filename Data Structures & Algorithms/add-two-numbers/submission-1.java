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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = 0, num2 = 0;

        ListNode temp1 = l1;
        while(temp1 != null){
            num1 = num1*10 + temp1.val;
            temp1 = temp1.next;
        }

        ListNode temp2 = l2;
        while(temp2 != null){
            num2 = num2*10 + temp2.val;
            temp2 = temp2.next;
        }

        long sum = reverse(num1) + reverse(num2);
        if (sum == 0) return new ListNode(0);
        ListNode head = new ListNode(0);
        ListNode temp = head;

        while(sum !=0){
            long rem = sum%10;
            temp.next = new ListNode((int)rem);
            temp = temp.next;
            sum /= 10;
        }

        return head.next;
    }

    private long reverse(long num){
        long rev = 0;
        while(num !=0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        return rev;
    }
}
