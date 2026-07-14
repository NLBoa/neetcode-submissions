class Solution {
    public int findMin(int[] nums) {

        if(nums.length == 2){
            if(nums[0] < nums[1]){
                return nums[0];
            } else {
                return nums[1];
            }
        }

        int curr = nums.length/2;
        int low = 0;
        int high = nums.length - 1;

        while(curr > 0 && curr < nums.length - 1)
        {
            if(nums[curr] < nums[curr + 1] && nums[curr] < nums[curr - 1]){
                return nums[curr];
            }
            if(nums[curr] < nums[high]){

                high = curr;
                curr = low + (high - low) / 2;
            } else {
                low = curr + 1;

                curr = low + (high - low) / 2;
            }
        }   

        return nums[curr];
    }
}