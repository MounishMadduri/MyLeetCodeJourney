class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder(); 
        char res = chars[0]; //a
        int count = 0;  // 0

        for(char ch:chars){ // c
            if(ch == res){
                count++; // 3
            }
            else{
                str.append(res); //b
                if(count>1){
                    str.append(count); //2
                }
                count = 0; //0
                res = ch; //c
                count++; //1
            }
        }
        str.append(res);
        if(count>1){
            str.append(count); //2
        }
        System.out.println(str);
        
        // Write back to original chars[] array
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        };
        return str.length();
    }
}