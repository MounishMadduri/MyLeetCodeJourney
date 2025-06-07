class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int res = 0;
        for(int i:nums){
            if(!(hm.containsKey(i))){
                hm.put(i,0);
            }
            int val = hm.get(i);
            hm.put(i,++val);
        }
        for(int i:nums){
            if(hm.get(i)>n/2 ){
                res = i;
            }
        }

        return res;

    }
}