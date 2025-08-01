class Solution {
    public int maxDifference(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!(hm.containsKey(s.charAt(i)))){
                hm.put(s.charAt(i), 1);
            }
            else{
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
        }
        System.out.println(hm);

        int maxOdd = 0;
        int maxEve = 11111111;
        for(char ch:hm.keySet()){
            if((hm.get(ch)%2!=0)){
                maxOdd = Math.max(maxOdd, hm.get(ch));
            }
            else{
                maxEve = Math.min(maxEve, hm.get(ch));
            }
        }
        System.out.println(maxOdd+" "+maxEve);
        return maxOdd - maxEve;

    }
}