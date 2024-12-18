class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // Brute Force
        // for(int i=0; i<matrix.length; i++){
        // for(int j=0; j<matrix[i].length; j++){
        // if(target == matrix[i][j]){
        // return true;
        // }
        // }
        // }
        // return false;

        // Little Optimal Solution
        // for (int i = 0; i < matrix.length; i++) {
        // int low = 0;
        // int high = matrix[i].length - 1;

        // while (low <= high) {
        // int mid = (low + high) / 2;
        // if (matrix[i][mid] == target) {
        // return true;
        // } else if (matrix[i][mid] > target) {
        // high = mid - 1;
        // } else {
        // low = mid + 1;
        // }
        // }
        // }
        // return false;

        // Most Optimal Solution
        int rows = matrix.length;
        int columns = matrix[0].length;
        int low = 0;
        int high = rows * columns - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = matrix[mid / columns][mid % columns];
            if (midValue == target) {
                return true;
            } else if (midValue > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return false;
    }
}