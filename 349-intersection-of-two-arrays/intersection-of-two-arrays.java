class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums1)
            hs1.add(i);
        for(int i:nums2)
            hs2.add(i);
        
        for(int i:hs1){ 
            if(hs2.contains(i)){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
        

    }
}