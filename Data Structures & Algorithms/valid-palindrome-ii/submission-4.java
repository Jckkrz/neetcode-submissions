class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return (palindromeHelp(left, right - 1, s) || 
                palindromeHelp(left + 1, right, s));
            }
            left++;
            right--;
        }

        return true;
    }
        

        private boolean palindromeHelp(int left, int right, String word){
            while(left < right){
                if(word.charAt(left) != word.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    
}