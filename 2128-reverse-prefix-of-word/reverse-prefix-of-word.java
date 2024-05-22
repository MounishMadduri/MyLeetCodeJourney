class Solution {
    public String reversePrefix(String word, char ch) {
        ArrayList<Character> res = new ArrayList<>();
        for(int k=0;k<word.length();k++)
            res.add(word.charAt(k));
        int i = 0;

        char temp;
        for(int j =0;j<res.size();j++){
            if(res.get(j) == ch){
                while(i<j){
                    temp = res.get(i);
                    res.set(i, res.get(j));
                    res.set(j, temp);
                    i++;
                    j--;
                }
                break;
            }
        }
        String result = "";
        for(char ele:res)
            result+=ele; 
        return result;
    }
}