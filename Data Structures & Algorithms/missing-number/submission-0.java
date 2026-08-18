class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        for(int i = 1; i <= nums.length; i++){
            count = count + i;
            System.out.println(count);
        }

        for(int i=0; i < nums.length; i++){
            count -= nums[i];
            System.out.println(count);
        }

        return count;
    }
}
