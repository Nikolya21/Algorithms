class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = firstIndex(nums, target);
        res[1] = secondIndex(nums, target);
        return res;
    }

    private static int firstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (nums[m] == target) {
                index = m;
            }
            if (nums[m] >= target) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }
        return index;
    }

    private static int secondIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (nums[m] == target) {
                index = m;
            }
            if (nums[m] <= target) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }
        return index;
    }
}
COMPLEXITY:
  # Space O(1)
  # Time O(log n)
