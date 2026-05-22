/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        Map<ListNode, Integer> hashMap = new HashMap<>();

        ListNode temp = headA;
        while(temp != null){
            hashMap.put(temp, 1);
            temp = temp.next;
        }
        ListNode temp2 = headB;
        while(temp2!= null){
            if (hashMap.containsKey(temp2)) return temp2;
            temp2 = temp2.next;
        }
        return null;
    }
}