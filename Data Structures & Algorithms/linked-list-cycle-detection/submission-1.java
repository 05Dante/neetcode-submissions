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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        ListNode var = head;

        if (var==null) return false;

        while(var.next!=null){
            if (hashMap.containsKey(var)){ return true;}
            else{
                hashMap.put(var, 1);
                var = var.next;
            }
        }
        return false;
    }
}
