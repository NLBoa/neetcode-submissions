class Solution {
    public int longestConsecutive(int[] nums) {
        

        Set<Integer> num = new HashSet<>();

        for(int n : nums){
            num.add(n);
        }

        int tCounter = 0;
        int counter = 1;


        for(int n : num){
            if(!num.contains(n - 1)){
                while(num.contains(n + 1)){
                    counter++;
                    n+=1;
                }
                tCounter = tCounter > counter ? tCounter : counter;
                counter = 1;
            }
        }

        return tCounter;
    }
}
