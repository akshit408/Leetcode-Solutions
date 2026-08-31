class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        // int n = s.length();
        // int[] fr1 = new int[26];
        // // for(int i = 0; i < n; i++){
        // //     fr[s.charAt(i) - 'A']++;
        // // }
        // int low = 0;
        // for(int high = 0; high < n / 2; high++){
        //     fr1[s.charAt(i) - 'A']++;
        // }
        // int[] fr2 = new int[26];
        // for(int high = n / 2; high < n; high++){
        //     fr2[s.charAt(high) - 'A']++;
        // }
        // int[] ans = new int[n];
        // if(Arrays.equals(fr1,fr2)){
        //     ans = s.substring(low,high);
        // }
        //     return ans;
        List<String> ans = new ArrayList<>();
        int low = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int high = 0; high < s.length(); high++){
            if(high - low + 1 == 10){
                String sub = s.substring(low,high + 1);
                map.put(sub,map.getOrDefault(sub, 0) + 1);
                if(map.get(sub) == 2){
                    ans.add(sub);
                }
                low++;
            } 
        }
        return ans;
    }
}