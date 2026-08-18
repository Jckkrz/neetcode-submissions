class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println(s);

        int right = s.length() -1;

        for(int left = 0; left < right; left++){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            right--;
        }
        return true;
    }
}
