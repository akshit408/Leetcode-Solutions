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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode store = null;
        ListNode bnext =null;
        ListNode temp1 = list1;
        int idx = 0;
        while(temp1 != null){
            if(idx == a - 1){
                store = temp1;
            }
            if(idx == b){
                bnext = temp1.next;
            }
            temp1 = temp1.next;
            idx++;
        }
        ListNode temp2 = list2;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        store.next = list2;
        temp2.next = bnext;
        return list1;
    }
}