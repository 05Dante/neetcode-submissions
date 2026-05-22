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
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        ListNode fort = l1;
        while(fort != null){
            s1.push(fort.val);
            fort = fort.next;
        }

        fort = l2;
        while(fort != null){
            s2.push(fort.val);
            fort = fort.next;
        }

        int num1, num2, carry=0;
        ListNode head = null;

        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int sum = 0;
            if (!s1.isEmpty()){
                sum += s1.pop();
            }
            if (!s2.isEmpty()){
                sum += s2.pop();
            }
            
            sum += carry;
            ListNode node = new ListNode(sum%10);
            carry = sum/10;
            node.next = head;
            head = node;
        }

        return head;
    }
}