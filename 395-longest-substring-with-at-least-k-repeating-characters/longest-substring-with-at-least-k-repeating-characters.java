class Solution {
    public int longestSubstring(String s, int k) {
    //     if(s.length() < k) return 0;
    //     int[] freq = new int[128];
    //     int low = 0;
    //     int max = 0;
    //     int len = 0;
    //     for(int i = 0; i < s.length(); i++){
    //         freq[s.charAt(i) - 'a']++;
    //         if(freq[s.charAt(i) - 'a'] >= k){
    //             i++;
    //             len = i - low + 1;
    //         }
    //         low++;
    //     }
    //    return len;
    int max = 0;
    for(int tar = 1; tar <= 26; tar++){
    int[] freq = new int[26];
    int uniq = 0;
    int count = 0;
    int low = 0;
    for(int i = 0; i < s.length(); i++){
       int idx = s.charAt(i) - 'a';
       if(freq[idx] == 0){
        uniq++;
       }
       freq[idx]++;
       if(freq[idx] == k){
        count++;
       }
       while(uniq > tar){
        int left = s.charAt(low) - 'a';
        if(freq[left] == k){
            count--;
        }
        freq[left]--;
        if(freq[left] == 0){
            uniq--;
        }
        low++;
       }
       if(uniq == tar && uniq == count){
        max = Math.max(max, i - low + 1);
       }
    }
    }
        return max;
    }
}
    
    