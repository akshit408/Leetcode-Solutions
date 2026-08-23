class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sum1 = 0;
        int sum2 = 0;
        int q1 = 0;
        int q2 = 0;
        char[] ch = num.toCharArray();
        for(int i = 0; i < n / 2; i++){
               if(ch[i] == '?'){
                q1++;
               }else{
                sum1 += ch[i] - '0';
               }
        }
        for(int i = n/2; i < n; i++){
            if(ch[i] == '?'){
                q2++;
            }else{
                sum2 += ch[i] - '0';
            }
        }
        int diff = sum1 - sum2;
        if(diff * 2 == (q2 - q1) * 9){
        return false;
        }
            return true;
    }
}