class Solution {
    public String reverseVowels(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        StringBuilder res = new StringBuilder(s);


        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        int i=0;
        int j=s.length()-1;

        char temp = ' ';
        while(i<j){
            if((hs.contains(s.charAt(i))) && (hs.contains(s.charAt(j)))){
                swap(res,i,j);
                i++;
                j--;

            }
            else if(!(hs.contains(s.charAt(i)))){
                i++;
            }
            else{
                j--;
            }
        }
        return res.toString();
    }
    public StringBuilder swap(StringBuilder res, int i, int j){
        char temp = ' ';
        temp = res.charAt(i);
        res.setCharAt(i, res.charAt(j));
        res.setCharAt(j,temp);
        return res;
    }
}