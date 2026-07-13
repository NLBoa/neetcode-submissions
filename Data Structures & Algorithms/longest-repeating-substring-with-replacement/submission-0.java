class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxFreq = 0;
        int ans = 0;
        int left = 0;

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'A']++;

            maxFreq = Math.max(maxFreq, count[s.charAt(i) - 'A']);

            if((i - left + 1) - maxFreq > k){

                count[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, i - left + 1);
        }

        return ans;
    }
 }
