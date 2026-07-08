class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) return false;

        int temp = n;
        int rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        return rev == n;
    }
}
// class Solution {
//     public boolean isPalindrome(int n) {

//         if (n <0 || (n % 10 == 0 && n != 0))return false;
            
//         int rev = 0;
//         while (n > rev) {
//             rev = rev * 10 + n % 10;
//             n /= 10;
//         }

//         return n == rev || n == rev / 10;
//     }
// }