class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            min = Math.min(min, num);
        }
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            c += nums[i] - min;
        }
        return c;
    }
}
