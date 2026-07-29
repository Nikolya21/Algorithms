class Solution {
    public static String multiply(String num1, String num2) {
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < num1.length(); ++i) {
            res1 = res1 * 10 + num1.charAt(i) - '0';
        }
        for (int i = 0; i < num2.length(); ++i) {
            res2 = res2 * 10 + num2.charAt(i) - '0';
        }
        int totalRes = res1 * res2;
        return "" + totalRes;
    }
}

# Space O(1)
# Time O(max{num1.length, num2.length})
