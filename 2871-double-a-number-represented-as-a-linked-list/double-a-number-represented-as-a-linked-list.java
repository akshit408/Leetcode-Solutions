import java.math.BigInteger;
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
    public ListNode doubleIt(ListNode head) {
        BigInteger num = BigInteger.ZERO;;
        ListNode curr = head;
        while(curr != null){
            num = num.multiply(BigInteger.TEN)
                     .add(BigInteger.valueOf(curr.val));
            curr = curr.next;
        }
        BigInteger ans = num.multiply(BigInteger.TWO);
        ListNode head1 = null;
        ListNode tail = null;
        String s = ans.toString();
        for(int i = 0; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            ListNode newN = new ListNode(digit);
            if(head1 == null){
                head1 = newN;
                tail = newN;
            }else{
                tail.next = newN;
                tail = newN;
            }
        }
        return head1;
    }
}