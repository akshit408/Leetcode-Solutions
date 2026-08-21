class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        int count = 0;
        ListNode curr = head;

        while(curr != null){
            count++;
            curr = curr.next;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int[] ans = new int[count];
        int idx = 0;

        ListNode temp = head;

        while(temp != null){

            if(!set.contains(temp.val)){
                ans[idx++] = temp.val;
            }

            temp = temp.next;
        }

        ListNode newHead = null;
        ListNode tail = null;

        for(int i = 0; i < idx; i++){

            ListNode nHead = new ListNode(ans[i]);

            if(newHead == null){
                newHead = nHead;
                tail = nHead;
            }
            else{
                tail.next = nHead;
                tail = nHead;
            }
        }

        return newHead;
    }
}