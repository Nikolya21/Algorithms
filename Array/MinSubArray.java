class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int[] copyNums = new int[nums.length + 1];
        int start = 0;
        int end = 1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return 1;
            }
        }
        for (int i = 1; i < copyNums.length; i++) {
            copyNums[i] = copyNums[i - 1] + nums[i - 1];
        }
        while (end < start || end < copyNums.length) {
            if (copyNums[end] - copyNums[start] < target) {
                end++;
            } else {
                if (min > end - start) {
                    min = end - start;
                }
                start++;
            }
        }
        if (min != Integer.MAX_VALUE) {
            return min;
        }
        return 0;
    }
}

Time: O(n)
Space: O(n)
