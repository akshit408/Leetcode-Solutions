class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0,end = (n*m)-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            int midElement = matrix[mid / m][mid % m];
            if(target == midElement){
                return true;
            }
            if(midElement < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(matrix[i][j] == target)return true;
        //     }
        // }
        // return false;
    }
}