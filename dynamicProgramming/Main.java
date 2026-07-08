class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;
        if (nums.length == 1) {
            return nums[0];
        } else {
            for (int num : nums) {
                if (total < 0) {
                    total = 0;
                }
                total += num;
                res = Integer.max(res, total);
            }
        }
        return res;
    }
}
