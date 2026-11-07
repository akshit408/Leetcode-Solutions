class Solution {
    public int maxVowels(String s, int k) {
        int low = 0;
        int len = 0;
        int max = 0;
        for(int high = 0; high < s.length(); high++){
            if(s.charAt(high) == 'a' || s.charAt(high) == 'e' || s.charAt(high) == 'i' || s.charAt(high) == 'o' || s.charAt(high) == 'u'){
            len++;
            }
            if(high - low + 1 > k){
                char left = s.charAt(low);
                if(left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u'){
                    len--;
                }
                low++;
            }
            if(high - low + 1 == k){
                max = Math.max(max, len);
            }
        }
            return max;
    }
}