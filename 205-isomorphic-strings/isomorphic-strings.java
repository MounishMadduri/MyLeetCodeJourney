class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        HashMap<Character, Character> hm1 = new HashMap<Character, Character>();
        if(s.length()!=t.length())
            return false;
        
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))&&(hm.get(s.charAt(i)))!=t.charAt(i)){
                return false;
            }
            hm.put(s.charAt(i),t.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(hm1.containsKey(t.charAt(i)) && hm1.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
            hm1.put(t.charAt(i),s.charAt(i));
        }
        String res="";
        for(int i=0;i<s.length();i++){
            res+=hm.get(s.charAt(i));
        }
        System.out.println(res+" "+t);
        if(res.equals(t))
            return true;
        return false;
    }

}