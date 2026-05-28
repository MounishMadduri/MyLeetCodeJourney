class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i:nums){

            if(!(hm.containsKey(i))){
                hm.put(i,1);
            }
            else{
                hm.put(i, hm.get(i)+1);
            }
            if(hm.get(i)>n/2){
                return i;
            }
            System.out.println(i);
        }

        return 0;

    }
}