class Solution {
    public String mergeAlternately(String word1, String word2) {
        

        int i=0;
        int j=0;
        StringBuilder res = new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        System.out.println(i +" "+ j);
        if(word1.length()>i){
            while(i<word1.length()){
                res.append(word1.charAt(i));
                i++;
            }
        }
        else{
            while(j<word2.length()){
                res.append(word2.charAt(j));
                j++;
            }
        }
        return res.toString();
    }
}