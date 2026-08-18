class Solution {
    public int[] getConcatenation(int[] nums) {
        int nNextIndex = nums.length;
        int[] doubles = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            doubles[i] = nums[i];
            doubles[nNextIndex + i] = nums[i];
        }

        return doubles;
    }
}