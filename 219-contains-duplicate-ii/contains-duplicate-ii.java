class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int high = 0; high < nums.length; high++){
            if(set.contains(nums[high])){
                return true;
            }
            set.add(nums[high]);
            if(set.size() > k){
                set.remove(nums[high - k]);
            }
        }
        return false;
    }
}