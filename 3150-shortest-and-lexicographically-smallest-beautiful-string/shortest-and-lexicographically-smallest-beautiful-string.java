class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        char[] ch = s.toCharArray();
        int low = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int high = 0; high < s.length(); high++){
            if(ch[high] == '1'){
                count++;
            }
                while(count == k){
                 if(high - low + 1 < min){
                 min = high - low + 1;
                 ans = s.substring(low, high + 1);
                }
                else if(high - low + 1 == min){
                String temp = s.substring(low, high + 1);
                if(temp.compareTo(ans) < 0){
                ans = temp;
                }
            }

           if(ch[low] == '1'){
            count--;
           }
           low++;
                }
        }
        return ans;
    }
}