class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<=k && i < nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], i);
            }
            else{
                if(Math.abs(i-hm.get(nums[i]))<=k){
                    return true;
                }
                else{
                    hm.put(nums[i], i);
                }
            }
        }
        System.out.println(hm);


        for(int j=k+1;j<nums.length;j++){
            hm.remove(nums[j-k-1]);
            if(hm.containsKey(nums[j]) && Math.abs(j-hm.get(nums[j]))<=k ){
                return true;
            }
            else{
                hm.put(nums[j], j);
            }
        }

        return false;


    }
}