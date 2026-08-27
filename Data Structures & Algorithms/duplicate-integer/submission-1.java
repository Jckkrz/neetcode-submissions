class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> digits = new HashSet<>();

        for(int num : nums){
            if(digits.contains(num)){
                return true;
            }
            digits.add(num);
        }

        return false;
    }
}