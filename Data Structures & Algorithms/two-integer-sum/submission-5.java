class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int[] returned = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(pairs.containsKey(target - nums[i])){
                returned[0] = pairs.get(target - nums[i]);
                returned[1] = i;
            }
            pairs.put(nums[i], i);
        }

        return returned;
    }
}
