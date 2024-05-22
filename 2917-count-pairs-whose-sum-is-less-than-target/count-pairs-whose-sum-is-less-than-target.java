class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        System.out.println(nums.toString());
        int i = 0;
        int j = nums.size()-1;
        int c = 0;
        while(i<j){
            int sum = nums.get(i)+nums.get(j);
            if(sum<target){
                c+=(j-i);
                i++;
            }
            else{
                j--;
            }
        }

        return c;
    }
}