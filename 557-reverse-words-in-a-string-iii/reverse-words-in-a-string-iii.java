class Solution {
    public String reverseWords(String s) {
        

        String[] split = s.split(" ");
        for(int k=0;k<split.length;k++){

            StringBuilder sb = new StringBuilder(split[k]);
            int i=0;
            int j=sb.length()-1;
            char temp = ' ';
            while(i<=j){
                temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
                
            }
                split[k]=sb.toString();

        }
    return String.join(" ", split);
    }
}