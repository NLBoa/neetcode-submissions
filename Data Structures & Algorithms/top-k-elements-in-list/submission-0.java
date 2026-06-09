class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> value = new HashMap<>();

        for(int i : nums){
            if(value.containsKey(i)){
                value.put(i, value.get(i) + 1);
            } else {
                value.put(i, 1);
            }
        }

        int[] retVal = new int[k];

        for(int i = 0; i < k; i++){
            int temp = 0;
            int tempKey = 0;
            for(Map.Entry<Integer, Integer> entry : value.entrySet()){
                if(entry.getValue() > temp){
                    temp = entry.getValue();
                    tempKey = entry.getKey();
                }
            }
            value.remove(tempKey);
            retVal[i] = tempKey;
        }

        return retVal;
    }
}
