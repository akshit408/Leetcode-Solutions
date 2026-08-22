class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = speed.length;

        double[] t = new double[n];
        for (int i = 0; i < n; i++) {
            t[i] = (double)(target - position[i]) / speed[i];
        }
        double[][] ans = new double[n][2];

        for (int i = 0; i < n; i++) {
            ans[i][0] = position[i];
            ans[i][1] = t[i];
        }
        Arrays.sort(ans, (a, b) -> Double.compare(b[0], a[0]));
        int count = 0;
        double mtime = 0;
        for(int i = 0; i < n; i++){
            double time = ans[i][1];
            if(time > mtime){
                count++;
                mtime = time;
            }
        }
            return count;
    }
}