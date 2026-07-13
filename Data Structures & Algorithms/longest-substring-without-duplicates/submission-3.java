class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxVal = 0;
        HashSet<Character> val = new HashSet<Character>();
        int temp = 0;

        for(int i = 0; i < s.length(); i++){
            while(val.contains(s.charAt(i))){
                val.remove(s.charAt(left));
                left++;
            }
            val.add(s.charAt(i));
            maxVal = Math.max(maxVal, i - left + 1);
        }

        return maxVal;
    }
}
