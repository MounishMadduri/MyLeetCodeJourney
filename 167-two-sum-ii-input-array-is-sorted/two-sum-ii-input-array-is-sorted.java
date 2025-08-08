class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i=0;
        int j=numbers.length-1;
        int sum=0;
        int[] res = new int[2];
        while(i<j){
            sum = numbers[i] + numbers[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
        }
    return res;
    }
}
//    1,2,3,4,7,11,15
//      i     j