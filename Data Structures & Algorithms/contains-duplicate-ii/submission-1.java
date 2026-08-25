class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> ints = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(ints.containsKey(nums[i])){
                if(Math.abs(ints.get(nums[i]) - i) <= k){
                    return true;
                }
                else{ints.put(nums[i], i);}
            }

            ints.put(nums[i], i);
        }

        return false;
    }
}