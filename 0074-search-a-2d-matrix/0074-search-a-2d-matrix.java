public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int targetRow = -1;

        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;

            if (target > matrix[midRow][cols - 1]) {
                top = midRow + 1;
            } 
            else if (target < matrix[midRow][0]) {
                bottom = midRow - 1;
            } 
            else {
                targetRow = midRow;
                break;
            }
        }

        if (targetRow == -1) {
            return false;
        }

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;

            if (matrix[targetRow][midCol] == target) {
                return true;
            } else if (matrix[targetRow][midCol] < target) {
                left = midCol + 1; 
            } else {
                right = midCol - 1; 
            }
        }

        return false; 
    }
}