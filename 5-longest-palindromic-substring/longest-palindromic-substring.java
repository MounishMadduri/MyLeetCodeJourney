class Solution {
    public String longestPalindrome(String s) {
        
        int l=0;
        int r=0;
        int maxLength=0;
        String res=" ";
        for(int i=0;i<s.length();i++){
            l = i;
            r = i;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1)> maxLength){
                    maxLength = r-l+1;
                    res = s.substring(l,r+1);
                }
                l--;
                r++;
            }

            l = i;
            r = i+1;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1)> maxLength){
                    maxLength = r-l+1;
                    res = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        return res;

    }
}