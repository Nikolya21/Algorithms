class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        int findGeneral = -1;
        if (haystack.length() < needle.length()) {
            return -1;
        }
        while (j < haystack.length()) {
            if (haystack.charAt(j) == needle.charAt(i)) {
                if (i == 0) {
                    findGeneral = j;
                }
                j++;
                i++;
            } else {
                if (findGeneral != -1) {
                    j = findGeneral;
                }
                j++;
                findGeneral = -1;
                i = 0;
            }
            if (i == needle.length()) {
                return findGeneral;
            }
        }
        return -1;
    }
}
Time: O(n * m)
Space: O(1)
