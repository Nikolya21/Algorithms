class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        if (n == 0) { 
            return nums;
        }
        int rowStart = 0;
        int rowEnd = n - 1;
        int columnStart = 0;
        int columnEnd = n - 1;
        int num = 1;
        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                nums[rowStart][i] = num++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                nums[i][columnEnd] = num++;
            }
            columnEnd--;
            for (int i = columnEnd; i >= columnStart; i--) {
                nums[rowEnd][i] = num++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                nums[i][columnStart] = num++;
            }
            columnStart++;
        }
        return nums;
    }
}

Time: O(n^2)
Space: O(n^2)
