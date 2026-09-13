class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int n = nums.length;
        // int sum = 0;
        // for(int i = 0; i < n; i++){
        //     sum += nums[i];
        // }
        int low = 0;
        int high = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while(high < n){
            sum += nums[high];
        
            while(sum >= target){
                int len = high - low + 1;
                res = Math.min(res,len);
                sum = sum - nums[low];
                low++;
            }
            high++;
            } 
            if(res == Integer.MAX_VALUE) return 0;
        
        
        
           return res; 
        
    }
}