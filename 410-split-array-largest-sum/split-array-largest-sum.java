class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;
        for(int num: nums){
            if(num > s){
                s = num;
            }
            e += num;
        }
        while(s < e){
            int mid = s + (e - s) / 2;
            int sum = 0;
            int p = 1;
            for(int num: nums){
                if(sum + num > mid){
                    sum = num;
                    p++;
                }else{
                    sum += num;
                }
            }
                 if(p > k){
                    s = mid + 1;
                 }   else{
                    e = mid;
                 }
            }
        
        return e;
    }
}