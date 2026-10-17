class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = 2;
        int c = 0;
        while(high < n){
            int d = nums[low + 1] - nums[low];
        
        while(high < n && nums[high] - nums[high - 1] == d){
            high++;
        }
        int len = high - low;
        if(len >= 3){
            c += (len - 1) * (len - 2) / 2;
        }
        low = high - 1;
        high = low + 2;
        }
        return c;
    }
}