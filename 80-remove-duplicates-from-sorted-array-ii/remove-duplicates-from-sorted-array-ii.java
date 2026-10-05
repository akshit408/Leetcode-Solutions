class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
             int limit = Math.min(count,2);
             for(int j = 0; j < limit; j++){
                ans[k++] = nums[i];
             }
              while(i + 1 < n && nums[i] == nums[i+1]){
                i++;
              }  
        }
        for(int i = 0; i < k; i++){
            nums[i] = ans[i];
        }
        return k;
    }
}