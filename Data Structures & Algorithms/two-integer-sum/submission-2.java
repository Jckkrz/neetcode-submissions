class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> compliment = new HashMap<>();

        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(compliment.containsKey(target - nums[i])){
                answer[0] = compliment.get(target - nums[i]);
                answer[1] = i;
            }

            compliment.put(nums[i], i);
        }

        return answer;
    }
}
