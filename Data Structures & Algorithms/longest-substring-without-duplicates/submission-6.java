class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int left = 0;
        HashSet<Character> chars = new HashSet<>();

        for(int right = 0; right < s.length(); right++){

            while(chars.contains(s.charAt(right))){
                chars.remove(s.charAt(left));
                left++;
            }

            chars.add(s.charAt(right));
            length = Math.max(length, right - left + 1);

        }

        return length;
    }
}
