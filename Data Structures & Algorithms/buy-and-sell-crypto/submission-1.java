class Solution {
    public int maxProfit(int[] prices) {

        int largestDifference = 0;
        int currSmallest = prices[0];
        
        for(int curr = 0; curr < prices.length; curr++){
            if(prices[curr] < currSmallest){
                currSmallest = prices[curr];
            } if( (prices[curr] - currSmallest) > largestDifference){
                largestDifference = prices[curr] - currSmallest;
            } 
        }
        return largestDifference;
    }
}
