class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ans = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
        set.add(num);
        }
            int i = 1;
            while(true){
                ans = k*i;
                if(!set.contains(ans)) break;
                i++;
            }
        return ans;
    }
}