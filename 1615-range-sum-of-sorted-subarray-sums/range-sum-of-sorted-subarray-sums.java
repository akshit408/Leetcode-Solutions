class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] ans = new int[n * (n + 1) / 2];
        int k = 0;
        for(int i = 0; i < n; i++){
        int sum = 0;
            for(int j = i; j< n; j++){
                sum += nums[j];
                ans[k++] = sum;
            }
        }
        Arrays.sort(ans);
        int MOD = 1_000_000_007;
        long sum1 = 0;
        for(int i = left - 1; i < right; i++){
           sum1 = (sum1 + ans[i]) % MOD;
        }
        return (int)sum1;
    }
}