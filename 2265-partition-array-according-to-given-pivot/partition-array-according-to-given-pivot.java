class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> leftArr = new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
                leftArr.add(i);
            }
        }
        for(int j:nums){
            if(j==pivot){
                leftArr.add(j);
            }
        }
        for(int k:nums){
            if(k>pivot){
                leftArr.add(k);
            }
        }
        // return leftArr;
        int[] res = new int[nums.length];
        for(int l =0;l<nums.length;l++){
            res[l] = leftArr.get(l);
        }
        return res;
    }
}