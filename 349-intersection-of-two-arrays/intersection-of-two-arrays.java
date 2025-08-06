class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert HashSet to int[]
        int[] res = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            res[i++] = num;
        }

        return res;
    }
}
