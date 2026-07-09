class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lRow = 0;
        int RRow = matrix.length - 1;
        int targetRow = -1;
        while (lRow <= RRow) {
            int mRow = lRow + (RRow - lRow) / 2;
            if (matrix[mRow][0] <= target && target <= matrix[mRow][matrix[0].length - 1]) {
                targetRow = mRow;
                break;
            } else if (target > matrix[mRow][matrix[0].length - 1]) {
                lRow = mRow + 1;
            } else {
                RRow = mRow - 1;
            }
        }
        if (targetRow == -1) {
            return false;
        }
        int lColumn = 0;
        int RColumn = matrix[0].length - 1;
        while (lColumn <= RColumn) {
            int mColumn = lColumn + (RColumn - lColumn) / 2;
            if (matrix[targetRow][mColumn] == target) {
                return true;
            } else if (matrix[targetRow][mColumn] < target) {
                lColumn = mColumn + 1;
            } else {
                RColumn = mColumn - 1;
            }
        }
        return false;
    }
}

COMLPEXITY:
# Space O(1)
# Time O(log (n * m))
