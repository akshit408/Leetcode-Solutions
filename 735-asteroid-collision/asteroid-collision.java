class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && st.peek() > 0 && arr[i] < 0){
                if(st.peek() < Math.abs(arr[i])){
                    st.pop();
                } else if(st.peek() == Math.abs(arr[i])){
                    st.pop();
                    arr[i] = 0;
                    break;
                }else{
                    arr[i] = 0;
                    break;
                }
            }
            if(arr[i] != 0){
            st.push(arr[i]);
            }
        }
        int[] ans = new int[st.size()];
        for(int i = ans.length - 1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}