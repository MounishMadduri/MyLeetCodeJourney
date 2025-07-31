class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] splitArr = s.trim().split("\\s+");
        // \\s - space and + means more spaces

        return splitArr[splitArr.length - 1].length();

    }
}