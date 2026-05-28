class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j = height.length-1;
        int area;
        int max=0;
        while(i<j){
            if(height[i]<height[j]){
                area = height[i]*(j-i);
                max = Math.max(max,area);
                i++;
            }
            else{
                area = height[j]*(j-i);
                max = Math.max(max,area);
                j--;
            }
        }
        return max;

    }
}