class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int white = 0;
        int minWhite = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
        }
        minWhite = Math.min(white, minWhite);

        for(int j=k;j<blocks.length();j++){
            if(blocks.charAt(j-k) == 'W'){
                white--;
            }
            if(blocks.charAt(j) == 'W'){
                white++;

            }
        minWhite = Math.min(white, minWhite);
        }
        return minWhite;



    }
}