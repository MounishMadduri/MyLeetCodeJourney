class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        

        HashMap<Character,Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if (s.length() < p.length()) return arr;
        for(int i=0;i<p.length();i++){
            if(!hm.containsKey(p.charAt(i))){
                hm.put(p.charAt(i), 1);
            }
            else{
                hm.put(p.charAt(i),hm.get(p.charAt(i))+1);
            }
        }
        // first window
        HashMap<Character,Integer> hm1 = new HashMap<>();
        int k = p.length();
        for(int j=0;j<k;j++){
            if(!hm1.containsKey(s.charAt(j))){
                hm1.put(s.charAt(j), 1);
            }
            else{
                hm1.put(s.charAt(j),hm1.get(s.charAt(j))+1);
            }
        }
        if(hm1.equals(hm)){
            arr.add(0);
        }

        for(int q=k;q<s.length();q++){
            // if(hm1.containsKey(s.charAt(q-k))){
            if(hm1.get(s.charAt(q-k))>1){
                hm1.put(s.charAt(q-k), hm1.get(s.charAt(q-k))-1);
            }
            else{
                hm1.remove(s.charAt(q-k));
            }
            // }
            if(!hm1.containsKey(s.charAt(q))){
                hm1.put(s.charAt(q), 1);
            }
            else{
                hm1.put(s.charAt(q),hm1.get(s.charAt(q))+1);
            }
            if(hm1.equals(hm)){
                arr.add(q-k+1);
            }


        }
        return arr;


    }
}