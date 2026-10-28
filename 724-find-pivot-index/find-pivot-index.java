class Solution {
    public int pivotIndex(int[] nums) {
       for(int i = 0; i < nums.length; i++){
            int prefSum = 0;
            int sufSum = 0;
            int[] pref = new int[nums.length];
            int[] suff = new int[nums.length];
            for(int j = 0; j < i; j++){
                prefSum += nums[j];
            }   
                for(int k = nums.length - 1; k > i; k--){
                    sufSum += nums[k];
                }
                if(prefSum == sufSum){
                    return i;
                }
            
        }
        return -1;
    }
}