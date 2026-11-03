class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            c += nums[i] - min;
        }
        return c;
    }
}