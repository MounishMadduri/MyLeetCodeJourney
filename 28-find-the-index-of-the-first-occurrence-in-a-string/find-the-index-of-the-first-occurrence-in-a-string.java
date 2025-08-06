class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0){
            return 0;
        }

        int i = 0;
        int j = 0;
        int pos = 0;

        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                if(j == needle.length()){
                    return i-j;
                }
            }
            else{
                pos++;
                i = pos;
                j=0;
            }
        }
        return -1;


    }
}