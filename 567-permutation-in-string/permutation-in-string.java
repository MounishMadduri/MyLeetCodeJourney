class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        HashMap<Character, Integer> hm  =  new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(!hm.containsKey(s1.charAt(i))){
                hm.put(s1.charAt(i), 1);
            }
            else{
                hm.put(s1.charAt(i), hm.get(s1.charAt(i))+1);
            }
        }
        System.out.println(hm);
        //  first window
        HashMap<Character, Integer> hm1  =  new HashMap<>();
        int k = s1.length();
        for(int j=0;j<k;j++){
            if(!hm1.containsKey(s2.charAt(j))){
                hm1.put(s2.charAt(j), 1);
            }
            else{
                hm1.put(s2.charAt(j), hm1.get(s2.charAt(j))+1);
            }
        }
        if(hm.equals(hm1)){
                return true;
            }
        //  remaining windows

        for(int q=k;q<s2.length(); q++){
            System.out.println(hm1);
            
            if(hm1.get(s2.charAt(q-k))>1){
                hm1.put(s2.charAt(q-k),hm1.get(s2.charAt(q-k))-1);
            }
            else{
                hm1.remove(s2.charAt(q-k));
            }
        

            if(!hm1.containsKey(s2.charAt(q))){
                hm1.put(s2.charAt(q), 1);
            }
            else{
                hm1.put(s2.charAt(q), hm1.get(s2.charAt(q))+1);
            }
            System.out.println(hm1);
            if(hm.equals(hm1)){
                return true;
            }

        }



    return false;

    }
}