class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] retVals = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int retVal = 1;
            for(int a = 0; a < nums.length; a++){
                if(a == i){
                    continue;
                } else {
                    retVal *= nums[a];
                }
            }

            retVals[i] = retVal;
        }

        return retVals;
    }
}  
