class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for(String a: strs){
            s.append(a.length()).append("#").append(a); 
        }

        return s.toString();
    }

    public List<String> decode(String str) {


        ArrayList<String> retVal = new ArrayList<String>();
        int index = 0;
        while(index < str.length()){

            int j = str.indexOf('#', index);
            int strLength = Integer.parseInt(str.substring(index, j));

            retVal.add(str.substring(j + 1, j + 1 + strLength));
            index = j + 1 + strLength;
        }

        return retVal;
    }
}
