class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,0);
            }
            hm.put(i,hm.get(i)+1);
            if(hm.get(i)>1){
                return true;
            }
        }
        return false;

    }
}