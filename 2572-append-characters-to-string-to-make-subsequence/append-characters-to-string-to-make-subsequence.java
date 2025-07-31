class Solution {
    public int appendCharacters(String s, String t) {
        
        int i = 0;
        int j = 0;

        while(i<t.length() && j<s.length()){
            if(t.charAt(i) == s.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==t.length()){
            return 0;
        }
        return t.length()-i;

    }
}