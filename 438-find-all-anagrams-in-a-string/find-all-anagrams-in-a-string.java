class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }
        int[] fr1 = new int[26];
        for (int i = 0; i < p.length(); i++) {
            fr1[p.charAt(i) - 'a']++;
        }
        int[] fr2 = new int[26];
        int low = 0;
        for (int i = 0; i < p.length(); i++) {
            fr2[s.charAt(i) - 'a']++;
        }
        for (int high = p.length() - 1; high < s.length(); high++) {
            if (Arrays.equals(fr1, fr2)) {
                ans.add(low);
            }
            fr2[s.charAt(low) - 'a']--;
            low++;
            if (high + 1 < s.length()) {
                fr2[s.charAt(high + 1) - 'a']++;
            }
        }

        return ans;
    }
}







        


            

            

            