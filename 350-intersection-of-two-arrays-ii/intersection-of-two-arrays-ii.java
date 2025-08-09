class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // 1 1 2 2 
        // 2 2
        // if(i<j) i++;
        // else j++
        // if(==)
        //  res.add(i)
        List<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }
            else{
                res.add(nums1[i]);
                i++;j++;
            }
        }
    System.out.println(res);
    int[] resArr = new int[res.size()];
    for(int m=0;m<res.size();m++){
        resArr[m] = res.get(m);
    }
    return resArr;
    }
}