class Solution {
    public int maxVowels(String s, int k) {
        
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        int c=0;
        int res = 0;
        for(int i=0;i<k;i++){
            if(hs.contains(s.charAt(i))){
                c++;
            }
        }
        res = Math.max(res, c);

        for(int j=k;j<s.length();j++){
            if(hs.contains(s.charAt(j-k))){
                c--;

            }
            if(hs.contains(s.charAt(j))){
                c++;
            }
            res = Math.max(res, c);
        }


        return res;



    }
}