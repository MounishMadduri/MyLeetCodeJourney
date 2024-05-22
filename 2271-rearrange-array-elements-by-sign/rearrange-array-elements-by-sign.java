class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int num:nums){
            if(num>0){
                arr1.add(num);
            }
            else{
                arr2.add(num);
            }
        }
        // int[] res = new int[nums.length];
        int i = 0;
        int c = 0;
        while(i<arr1.size()){
            res.add(arr1.get(i));
            res.add(arr2.get(i));
            i++;
        }
        int[] result = new int[nums.length];
        for(int z=0;z<nums.length;z++){
            result[z] = res.get(z);
        }
        return result;
    }

}