class Solution {
    public int divisorSubstrings(int num, int k) {

        int c=0;
        String numString = ""+num;

        StringBuilder window = new StringBuilder();

        String kNumStr = numString.substring(0,k);
        window.append(kNumStr);
        int knum = Integer.parseInt(kNumStr);

        if(num%knum == 0){
            c++;
        }

        for(int j=k;j<numString.length();j++){
            window.deleteCharAt(0);
            window.append(numString.charAt(j));
            kNumStr = window.toString();
            knum = Integer.parseInt(kNumStr);
            if(knum!=0 && num%knum == 0){
                c++;
            }


        }






        return c;

    }
}