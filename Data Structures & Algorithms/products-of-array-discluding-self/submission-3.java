class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] retVals = new int[nums.length];

        int[] leftVals = new int[nums.length];
        int[] rightVals = new int[nums.length];

        //for leftside value multiplication
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                leftVals[i] = 1;
            } else {
                leftVals[i] = leftVals[i - 1] * nums[i - 1];
            }
        }
        
        //for rightside value multiplication
        for(int i = nums.length - 1; i >= 0; i--){
            if(i == nums.length - 1){
                rightVals[i] = 1;
            } else {
                rightVals[i] = rightVals[i + 1] * nums[i + 1];
            }
        }

        for(int i = 0; i < nums.length; i++){
            retVals[i] = leftVals[i] * rightVals[i];
        }

        return retVals;

    }
}  
