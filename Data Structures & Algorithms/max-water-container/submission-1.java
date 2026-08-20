class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int height = 0;
        int width = 0;
        int area = 0;

        while(left < right){
            width = right - left;
            if(heights[left] > heights[right]){
                height = heights[right];
            }
            else{height = heights[left];}
            if(width * height > area){
                area = width * height;
            }
            if(heights[left] > heights[right]){
                right--;
            }
            else if(heights[left] < heights[right]){
                left++;
            }
            else{left++;}
        }

        return area;
    }
}
