class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> hs1 = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                List<Integer> first = new ArrayList<>();
                int third = -(nums[i]+nums[j]);
                if(hs1.contains(third)){
                    first.add(nums[i]);
                    first.add(nums[j]);
                    first.add(third);
                    Collections.sort(first);
                    if(!hs.contains(first)){
                        hs.add(first);
                        res.add(first);
                    }
                }
                hs1.add(nums[j]);
            }
        }
        return res;

    }
}