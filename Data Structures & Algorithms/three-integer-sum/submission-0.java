class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        ArrayList<List<Integer>> retVal = new ArrayList<>();
        //Sort Array
        Arrays.sort(nums);

        //Get value [b] see if it matches a or c
        for(int a = 0; a < nums.length; a++){

            if(a > 0 && nums[a] == nums[a - 1]){
                continue;
            }


            int left = a + 1; int right = nums.length - 1;

            while(left < right){
                int leftVal = nums[left];
                int rightVal = nums[right];

                if(leftVal + rightVal + nums[a] > 0){
                    right = right - 1;
                } else if(leftVal + rightVal + nums[a] < 0) {
                    left = left + 1;
                } else {
                    ArrayList<Integer> b = new ArrayList<>();
                    b.add(nums[a]);
                    b.add(leftVal);
                    b.add(rightVal);

                    retVal.add(b);
                    left = left + 1;
                    while(left < right && nums[left] == nums[left - 1]){
                        left = left + 1;
                    } 

                    right = right - 1;
                    while (right > left && nums[right] == nums[right + 1]){
                        right = right - 1;
                    }
                }
            }
        }

        return retVal;
    }
}
