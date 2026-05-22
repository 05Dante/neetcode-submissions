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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        List<Integer> list = new ArrayList<>();

        if (curr1 != null){
            while(curr1.next != null){
                list.add(curr1.val);
                curr1 = curr1.next;
            }
            list.add(curr1.val);
        }
        if (curr2 != null){
            while(curr2.next != null){
                list.add(curr2.val);
                curr2 = curr2.next;
            }
            list.add(curr2.val);
        }

        if (list.size() == 0) return null;

        Collections.sort(list);

        ListNode ansList = new ListNode(list.get(0));
        ListNode v = ansList;

        for (int i=1; i<list.size(); i++){
            v.next = new ListNode(list.get(i));
            v = v.next;
        }

        return ansList;
    }
}