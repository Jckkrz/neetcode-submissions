class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase().replaceAll("[^a-z0-9]", "");
        int end = s.length() - 1;
        for(int i = 0; i <= end; i++){
            if(s.charAt(i) != s.charAt(end)){
                return false;
            }

            end--;
        }

        return true;
    }
}
