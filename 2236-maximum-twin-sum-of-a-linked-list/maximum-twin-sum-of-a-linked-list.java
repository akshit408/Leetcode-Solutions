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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        temp = head;
        int index = 0;
        while (temp != null) {
            arr[index] = temp.val;
            index++;
            temp = temp.next;
        }
        int max = 0;
        int sum = 0;
        for(int i = 0; i <= (len/2) - 1; i++){
            sum = arr[i] + arr[len - 1 - i];
            max = Math.max(max, sum);
        } 
            return max;
    }
}

