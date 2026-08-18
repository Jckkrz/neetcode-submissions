class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> compliment = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            if(compliment.containsKey(target - nums[i])){
                return new int[]{compliment.get(target - nums[i]), i};
            }

            compliment.put(nums[i], i);
        }

        return new int[]{};
    }
}
