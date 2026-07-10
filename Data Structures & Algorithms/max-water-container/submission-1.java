class Solution {
    public int maxArea(int[] heights) {
        /*
        Formula: 
        (Lowest) * (W1 - W2)
        */
        int left = 0;
        int right = heights.length - 1;
        int maxValue = 0;

        while(left < right){

            int minWall = heights[left] < heights[right] ? 
            heights[left] : heights[right];
            int value = (minWall) * (right - left);

             if(value > maxValue) {
                maxValue = value;
             }

             if(heights[left] > heights[right]){
                right -= 1;
             } else {
                left += 1;
             }
        }

        return maxValue;
    }
}
