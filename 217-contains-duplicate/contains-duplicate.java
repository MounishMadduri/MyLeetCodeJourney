class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            if(!(hm.containsKey(i))){
                hm.put(i,0);
            }
            int val = hm.get(i);
            hm.put(i, ++val);
        }
        for(int i: nums){
            if(hm.get(i)>1){
                return true;
            }
        }
        return false;
    }
}