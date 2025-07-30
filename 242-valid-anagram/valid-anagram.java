class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!hm1.containsKey(s.charAt(i))){
                hm1.put(s.charAt(i), 1);
            }
            else{
                hm1.put(s.charAt(i), hm1.get(s.charAt(i))+1);
            }
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int j=0;j<t.length();j++){
            if(!hm2.containsKey(t.charAt(j))){
                hm2.put(t.charAt(j), 1);
            }
            else{
                hm2.put(t.charAt(j), hm2.get(t.charAt(j))+1);
            }
        }
        System.out.println(hm1+ "   -> "+hm2);
        
        // for(int i=0;i<s.length();i++){
        //     if ((hm1.get(s.charAt(i)) != hm2.get(s.charAt(i)))){
        //         return false;
        //     }
        // }
        // return true;
        
        return hm1.equals(hm2);


    }
}