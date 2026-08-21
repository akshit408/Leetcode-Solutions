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
    public ListNode removeNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        int idx = 0;
        while(temp != null){
            arr[idx++] = temp.val;
            temp = temp.next;
        }
        int[] ans = new int[count];
        Stack<Integer> st = new Stack<>();
        for(int i = count - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
         ListNode dummy = new ListNode(0);
         ListNode tail = dummy;

        for (int i = 0; i < count; i++) {
            if (ans[i] == 0) { 
                tail.next = new ListNode(arr[i]);
                tail = tail.next;
            }
        }

        return dummy.next;
    }
}