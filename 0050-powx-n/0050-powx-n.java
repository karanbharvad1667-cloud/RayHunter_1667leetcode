class Solution {
    public double myPow(double x, int n) {
        long N = n;  // prevent overflow
        if (N == 0) return 1;
        // Handle negative power first
        if (N < 0) {
            x = 1 / x;
            N = -N;// becouse return no in positive
        }
        double call = myPow(x, (int)(N / 2));
        if (N % 2 == 0) return call * call;
        else return x * call * call;
    }
}