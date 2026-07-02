class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) return new int[]{-1, -1};

        int lo = 0, hi = n - 1;
        int f = firstidx(lo, hi, arr, target);
        int l = lastidx(lo, hi, arr, target);

        return new int[]{f, l};
    }

    public int firstidx(int lo, int hi, int[] arr, int target) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == target) {
            int fidx = firstidx(lo, mid - 1, arr, target);
            if (fidx == -1) return mid;
            else return fidx;
        }

        if (arr[mid] > target)
            return firstidx(lo, mid - 1, arr, target);
        else
            return firstidx(mid + 1, hi, arr, target);
    }

    public int lastidx(int lo, int hi, int[] arr, int target) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == target) {
            int lidx = lastidx(mid + 1, hi, arr, target);
            if (lidx == -1) return mid;
            else return lidx;
        }

        if (arr[mid] > target)
            return lastidx(lo, mid - 1, arr, target);
        else
            return lastidx(mid + 1, hi, arr, target);
    }
}