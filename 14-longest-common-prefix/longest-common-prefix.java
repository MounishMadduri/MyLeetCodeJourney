class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ref = strs[0];
        String res = "";
        for(int i=0;i<ref.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i == strs[j].length() || strs[j].charAt(i) != ref.charAt(i)){
                    return res;
                }
            }
            res+=ref.charAt(i);
        }
        return res;
    }
}