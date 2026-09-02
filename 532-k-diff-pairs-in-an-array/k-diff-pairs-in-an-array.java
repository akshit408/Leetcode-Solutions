class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = 1;
        int c = 0;
        while(r < nums.length){
            if(l == r){
                r++;
            }else if(nums[r] - nums[l] < k){
                r++;
            }else if(nums[r] - nums[l] > k){
                l++;
            }else{
                c++;
                int left = nums[l];
                int right = nums[r];
                while(l < nums.length && nums[l] == left){
                    l++;
                }
                while(r < nums.length && nums[r] == right){
                    r++;
                }
            }
        }
        return c;
    }
}