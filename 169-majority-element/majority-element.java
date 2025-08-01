class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums){
            if(!(hm.containsKey(i))){
                hm.put(i,1);
            }
            else{
                hm.put(i, hm.get(i)+1);
            }
        }
        int max = 0;
        int keyRes = 0;
        for(int key:hm.keySet()){
            if(hm.get(key)>max){
                max = hm.get(key);
                keyRes = key;
            }
        }
        return keyRes;
    }
}