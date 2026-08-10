class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int low = 0;
        int product = 1;
        int count = 0;
        for(int high = 0; high < nums.length; high++){
            product *= nums[high];
            while(product >= k && low <= high){
                product /= nums[low];
                low++;
            }
            count += high - low + 1;
        }
        return count;
    }
}