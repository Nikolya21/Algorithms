class Solution {
    public int longestPalindrome(String s) {
        boolean isTrue = false;
        Map<Character, Integer> map = new HashMap<>();
        int countChet = 0;
        if (s.length() == 1) {
            return 1;
        }
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count % 2 == 0) {
                countChet += count;
            } else {
                countChet += (count - 1);
                isTrue = true;
            }
        }
        if (isTrue) {
            countChet += 1;
        }
        return countChet;
    }
}

COMPLEXITY
  SPACE O(n)
  TIME O(n)
