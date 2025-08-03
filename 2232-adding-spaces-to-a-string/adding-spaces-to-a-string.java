class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder res = new StringBuilder();

        int j=0;

        for(int i=0;i<s.length();i++){
            if((j<spaces.length)&&(i==spaces[j])){
                res.append(" ");
                res.append(s.charAt(i));
                j++;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}