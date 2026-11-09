class Solution {
    public int maxVowels(String s, int k) {
        int low = 0;
        int len = 0;
        int max = 0;
        for(int high = 0; high < s.length(); high++){
            char ch = s.charAt(high);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                len++;
            }
                if(high - low + 1 == k){
                    max = Math.max(len, max);
                    char left = s.charAt(low);
                    if(left == 'a' || left == 'e' || left == 'i' || left == 'o' || left =='u'){
                        len--;
                    }
                    low++;
            }
        }
        return max;
    }
}