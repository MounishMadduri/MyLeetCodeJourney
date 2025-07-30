class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if (!(hm.containsKey(diff))){
                hm.put(nums[i], i );
            }
            else{
                res[0] = hm.get(diff);
                res[1] = i;
            }

        }
            return res;


    }
}