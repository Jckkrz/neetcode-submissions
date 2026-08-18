class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            frequencies.put(nums[i], frequencies.getOrDefault(nums[i], 0) + 1);

            if(frequencies.get(nums[i]) > (nums.length / 2)){
                return nums[i];
            }
        }

        return -1;
    }
}