class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = s.length(); j >= 1; j--){
            for(int i = 0; i <128; i++){
                if(freq[i] == j){
                    char ch = (char) i;
                    for(int k = 0; k < j; k++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }   
}