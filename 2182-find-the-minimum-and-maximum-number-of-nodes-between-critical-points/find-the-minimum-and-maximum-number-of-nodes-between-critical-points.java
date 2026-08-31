class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int[] ans = new int[len];
        int idx = 0;
        ListNode prev = head;
        temp = head.next;
        int index = 1;
        while (temp.next != null) {
            if ((temp.val > prev.val && temp.val > temp.next.val) ||
                (temp.val < prev.val && temp.val < temp.next.val)) {

                ans[idx++] = index;
            }

            prev = temp;
            temp = temp.next;
            index++;
        }
        if (idx < 2) {
            return new int[]{-1, -1};
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 1; i < idx; i++) {
            int diff = ans[i] - ans[i - 1];
            min = Math.min(min, diff);
            max = Math.max(max, ans[i] - ans[0]);
        }
        return new int[]{min, max};
    }
}










       

        