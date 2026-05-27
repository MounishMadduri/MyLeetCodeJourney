class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        String sub = "";
        for(String s:details){
            sub = s.substring(11,13);
            if(Integer.parseInt(sub)>60){
                c++;
            }
        }
        return c;

    }
}