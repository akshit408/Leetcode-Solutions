class Solution {
    public boolean checkInclusion(String s1, String s2) {
    //     StringBuilder sb1 = new StringBuilder();
    //     for(int i = 0; i < s1.length(); i++){
    //         sb1.append(s1);
    //     }
    //     sb1.reverse();
    //    if(s2.contains(sb1) || s2.contains(s1)) return true;
    //    return false;
          int[] fr1 = new int[26];
          for(int i = 0; i < s1.length(); i++){
            fr1[s1.charAt(i) - 'a']++;
          }
          int[] fr2 = new int[26];
          int low = 0;
          for(int high = 0; high < s2.length(); high++){
            fr2[s2.charAt(high) - 'a']++;
             if(high - low + 1 > s1.length()){
                fr2[s2.charAt(low) - 'a']--;
                low++;
             }
             if(high - low + 1 == s1.length()){
                if(Arrays.equals(fr1, fr2)) return true;
             }
          }
          return false;
    }
}