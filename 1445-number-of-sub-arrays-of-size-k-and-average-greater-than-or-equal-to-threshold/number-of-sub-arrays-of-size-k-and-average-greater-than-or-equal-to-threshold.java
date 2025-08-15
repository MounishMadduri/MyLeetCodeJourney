class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int c = 0;
        double sum = 0;
        double avg = 0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        avg = sum/k;
        if(avg>=threshold){
            c++;
        }
        for(int j=k;j<arr.length;j++){
            sum -= arr[j-k];
            sum += arr[j];
            avg = sum/k;
            if(avg>=threshold){
                c++;
            }
        }

        return c;






    }
}