class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int idx = 0;
        for(int num = 1; num <= n; num++){
            if(num == target[idx]){
                ans.add("Push");
                idx++;
                if(idx == target.length){
                    break;
                }
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        } 
        return ans;
    }
}