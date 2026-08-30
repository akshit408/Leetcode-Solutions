class Solution {
    public int minLengthAfterRemovals(String s) {
        int c1 = 0;
        int c2 = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a') c1++;
            else c2++;
        }
        if(c1 > c2) return c1 - c2;
        return c2 - c1;
    }
}