class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> chars = new HashMap<>();
        int length = 0;

        while(right < s.length()){
            if(chars.containsKey(s.charAt(right))){
                length = Math.max(length, right - left);
                left = chars.get(s.charAt(right)) + 1;
                right = left;
                chars.clear();
            }

            chars.put(s.charAt(right), right);
            right++;
        }

        return Math.max(length, right - left);
    }
}
