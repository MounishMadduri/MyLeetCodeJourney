class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i=0;
        int max = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int j=0;j<s.length();j++){
            if(!hm.containsKey(s.charAt(j))){
                hm.put(s.charAt(j), 1);
                max = Math.max(max, j-i+1);
            }
            else{
                hm.put(s.charAt(j), hm.get(s.charAt(j))+1);
            }

            while(hm.get(s.charAt(j))>1){
                if(hm.get(s.charAt(i))>1){
                    hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
                }
                else{
                    hm.remove(s.charAt(i));
                }i++;
            }
             max = Math.max(max, j-i+1);
        }
        return max;



    }
}