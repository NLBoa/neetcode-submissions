class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> cList = new HashMap<>();
        cList.put('(',')');
        cList.put('{','}');
        cList.put('[',']');
        Stack<Character> open = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(cList.containsKey(s.charAt(i))){
                open.add(cList.get(s.charAt(i)));
            } else {
                if(open.isEmpty() || open.pop() != s.charAt(i)){
                    return false;
                }
            }
        }

        return open.isEmpty();
    }
}
