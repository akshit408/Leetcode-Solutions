class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n * (n - 1) / 2];
        int idx = 0;
        int dif = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = i+1; j < nums1.length; j++){
                if(j != i){
                    dif = nums1[i] - nums1[j];
                    nums2[idx++] = dif;
                }
            }
        }
            boolean odd = false;
            boolean even = false;
            for(int i = 0; i < nums2.length; i++){
                if(nums2[i] % 2 == 0){
                    even = true;
                }else{
                    odd = true;
                }
            }
            return true;
    }
}