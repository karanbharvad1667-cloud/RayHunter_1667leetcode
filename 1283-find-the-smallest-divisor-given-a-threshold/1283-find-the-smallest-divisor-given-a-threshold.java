class Solution {
    public int smallestDivisor(int[] arr, int t) {
        int max = Integer.MIN_VALUE;

        for (int ele : arr) {
            max = Math.max(max, ele);
        }

        int lo = 1, hi = max, ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (threshold(mid, arr) <= t) {
                ans = mid;
                hi = mid - 1; // try smaller divisor
            } else {
                lo = mid + 1; // need bigger divisor
            }
        }

        return ans;
    }

    public int threshold(int div, int[] arr) {
        int t = 0;

        for (int ele : arr) {
            if (ele % div == 0) {
                t += ele / div;
            } else {
                t += ele / div + 1;
            }
        }

        return t;
    }
}