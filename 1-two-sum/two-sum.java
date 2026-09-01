class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // int n = nums.length;
        // int []arr = new int[2];
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(i != j && nums[i] + nums[j] == target){
        //             arr[0] = i;
        //             arr[1] = j;
                    
        //         }
        //     }
        // }
        // return arr;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                int r = target - nums[i];
                if(map.containsKey(r)){
                    return new int[]{map.get(r),i};
                }
                map.put(nums[i],i);
            }
            return new int[]{};
        // // Arrays.sort(nums);
        // int l = 0;
        // int r = nums.length - 1;
        // while(l < r){
        //     if(nums[l] + nums[r] > target){
               
        //        r--;
        //     } else if(nums[l] + nums[r] < target){
        //         l++;
        //     }else{
        //         return new int[]{l,r};
        //     }
        // }
        
        // return new int[]{};
    }
}