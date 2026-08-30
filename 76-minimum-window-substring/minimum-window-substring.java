class Solution {
    public String minWindow(String s, String t) {
        int[] freq1 = new int[128];
        int[] freq2 = new int[128];
        for(char ch : t.toCharArray()){
            freq2[ch]++;
        }
        int low = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        String ans = "";
        for(int high = 0; high < s.length(); high++){
           char ch = s.charAt(high);
           freq1[ch]++;
           if(freq1[ch] <= freq2[ch]){
            count++;
           }
            while(count == t.length()){
            if(high - low + 1 < min){
            min = high - low + 1;
            ans = s.substring(low, high + 1);
            }
            char left = s.charAt(low);
            freq1[left]--;
            if(freq1[left] < freq2[left]){
                count--;
            }
            low++;
        }
        }
        return ans;
    }
}