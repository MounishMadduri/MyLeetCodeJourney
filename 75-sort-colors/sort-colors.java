class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if((nums[i] != 0) && (nums[j] == 0)){
                swap(nums,i,j);
            }
            else if(nums[i]!=0 && nums[j]!=0){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(i+ " "+j);
        j = nums.length-1;
        while(i<=j){
            if((nums[i] != 1) && (nums[j] == 1)){
                swap(nums,i,j);
            }
            else if(nums[i]!=1 && nums[j]!=1){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(i+ " "+j);


    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}