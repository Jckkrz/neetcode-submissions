class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0;
        int left = 0;
        int right = heights.length - 1;

        while(left < right){
            if((right - left) * Math.min(heights[left], heights[right]) > maxVolume){
                maxVolume = (right - left) * Math.min(heights[left], heights[right]);
            }

            if(heights[left] < heights[right]){
                left++;
            }
            else if(heights[left] > heights[right]){
                right--;
            }
            else{left++;}
        }

        return maxVolume;
    }
}
