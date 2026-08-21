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
    public int[] nextLargerNodes(ListNode head) {
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            c++;
            temp = temp.next;
        }
            int[] arr = new int[c];
            temp = head;
            int idx = 0;
            while(temp != null){
                arr[idx++] = temp.val;
                temp = temp.next;
            }
            int[] ans = new int[c];
            Stack<Integer> st = new Stack<>();
            for(int i = c - 1; i >= 0; i--){
                while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans[i] = st.peek();
                }
                st.push(arr[i]);
            }
            return ans;
    }
}