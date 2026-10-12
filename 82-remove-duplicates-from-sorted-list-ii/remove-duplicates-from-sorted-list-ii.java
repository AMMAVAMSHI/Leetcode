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
        ListNode temp = head;
        Map<Integer,Integer> map = new HashMap<>();
        while(temp != null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        temp = head;
        while(temp != null){
            if(map.get(temp.val) == 1){
                ListNode newNode = new ListNode(temp.val);
                curr.next = newNode;
                curr = newNode;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}