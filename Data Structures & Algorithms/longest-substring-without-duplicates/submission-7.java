class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        HashSet<Character> chars = new HashSet<>();
        int length = 0;

        while(right < s.length()){
            while(chars.contains(s.charAt(right))){
                chars.remove(s.charAt(left));
                left++;
            }

            chars.add(s.charAt(right));
            length = Math.max(length, right - left + 1);
            right++;
        }

        return length;
    }
}
