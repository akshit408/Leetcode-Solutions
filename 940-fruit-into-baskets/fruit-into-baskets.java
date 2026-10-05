class Solution {
    public int totalFruit(int[] fruits) {
       int n = fruits.length;
       int low = 0;
       int max = 0;
       int uni = 0;
       int[] freq = new int[n];
       for(int high = 0; high < n; high++){
            if(freq[fruits[high]] == 0){
                uni++;
            }
            freq[fruits[high]]++;
            while(uni > 2){
                freq[fruits[low]]--;
                if(freq[fruits[low]]==0){
                    uni--;
                }
                low++;
            }
            max = Math.max(max, high - low + 1);
       }
       return max;
    }
}