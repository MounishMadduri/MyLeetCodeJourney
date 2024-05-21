class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer res = new StringBuffer();

        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            if(Character.isUpperCase(currChar) == true){
                res.append(Character.toLowerCase(currChar));
            }
            else if(Character.isLetterOrDigit(currChar)){
                res.append(currChar);
            }
        }
            // System.out.println(res);
        int l = 0;
        int r = res.length()-1;
        while(l<r){
            if(res.charAt(l) == res.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}