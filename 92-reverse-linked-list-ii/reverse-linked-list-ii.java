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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode prev = d;
        for(int i = 1; i < left; i++){
            prev = prev.next;
        }
        ListNode f = prev.next;
        ListNode s = f.next;
        for(int i = 0; i < right - left; i++){
            f.next = s.next;
            s.next = prev.next;
            prev.next = s;
            s = f.next;
            
        }
        return d.next;
    }
}