class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int pos = 0;
        int i = 0;
        int j = 0;
        while(i<haystack.length()){
            if(haystack.charAt(i) != needle.charAt(j)){
                pos++;
                i = pos;
                j = 0;
            }
            else{
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j; 
                }
            }
        }
        System.out.println(i+ "" + j+" " +pos);
        return -1;


    }
}