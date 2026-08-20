class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashMap<Character, Integer> chars = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char current_char = s.charAt(right);

            if (chars.containsKey(current_char) && chars.get(current_char) >= left) {
                left = chars.get(current_char) + 1;
            }

            chars.put(current_char, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
