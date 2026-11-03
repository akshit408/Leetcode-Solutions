class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int c= 0;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] != nums[nums.length - 1]){
                nums[i] = nums[i] + 1;
                c++;
            }
        }
        return c;
    }
}