class Solution {
    public void sortColors(int[] nums) {
        
        int ci =0;
        int cj = 0;
        int ck=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ci++;
            }
            else if(nums[i]==1){
                cj++;
            }
            else if(nums[i]==2){
                ck++;
            }
        }

        for(int j=0;j<ci;j++){
            nums[j] = 0;
        }
        for(int m=ci;m<ci+cj;m++){
            nums[m] = 1;
        }
        for(int w=ci+cj;w<ci+cj+ck;w++){
            nums[w] = 2;
        }


    }
}