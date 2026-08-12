class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int low = 0;
        int max = 0;

        for (int high = 0; high < nums.length; high++) {

            freq.put(nums[high], freq.getOrDefault(nums[high], 0) + 1);

            while (freq.get(nums[high]) > k) {

                freq.put(nums[low], freq.get(nums[low]) - 1);
                low++;
            }

            max = Math.max(max, high - low + 1);
        }

        return max;
    }
}