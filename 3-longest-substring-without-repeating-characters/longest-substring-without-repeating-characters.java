class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int max = 0;
       
        int[] freq = new int[256];
        for(int high = 0; high < s.length(); high++){
            
            freq[s.charAt(high)]++;
            while(freq[s.charAt(high)] > 1){
                freq[s.charAt(low)]--;
                low++;
            }
            max = Math.max(max, high - low + 1);
            }
        return max;
    }
}