class Solution {
    public int lengthOfLastWord(String s) {
        
        String stripped = s.strip();
        
        String[] splitted = stripped.split(" ");

        return splitted[splitted.length-1].length();

    }
}