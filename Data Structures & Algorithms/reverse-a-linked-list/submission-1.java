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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while(curr!=null){
            list.add(0, curr.val);
            curr = curr.next;
        }

        if (list.size() == 0) return null;

        ListNode ansList = new ListNode(list.get(0));
        ListNode curr2 = ansList;

        for(int i=1; i<list.size(); i++){
            curr2.next = new ListNode(list.get(i));
            curr2 = curr2.next;
        }

        return ansList;
    }
}
