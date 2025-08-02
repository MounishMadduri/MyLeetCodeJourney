class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder word = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                char lowerCased = Character.toLowerCase(s.charAt(i));
                word.append(lowerCased);
            }
        }
        String modWord = word.toString();
        
        int i =0;
        int j=word.length()-1;

        // if(word.length()==1){
        //     return false;
        // }
        while(i<=j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;


    }
}