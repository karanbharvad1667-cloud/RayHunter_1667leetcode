class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store nums1 elements
        for (int x : nums1) {
            set1.add(x);
        }

        // Check common elements
        for (int x : nums2) {
            if (set1.contains(x)) {
                result.add(x);   // duplicates automatically removed
            }
        }

        // Convert set to int[]
        int[] ans = new int[result.size()];
        int i = 0;

        for (int x : result) {
            ans[i++] = x;
        }

        return ans;
    }
}