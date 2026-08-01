class Solution {

    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        // skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;

        // sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        long ans = solve(s, i, 0);

        ans = ans * sign;

        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) ans;
    }

    private long solve(String s, int i, long num) {

        // base case
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return num;
        }

        num = num * 10 + (s.charAt(i) - '0');

        // overflow pruning
        if (num > Integer.MAX_VALUE) {
            return num;
        }

        return solve(s, i + 1, num);
    }
}


// class Solution {
//     public int myAtoi(String s) {
//         int i = 0;
//         int n = s.length();

//         // Step 1: skip leading spaces
//         while (i < n && s.charAt(i) == ' ')   i++;

//         // Step 2: check sign
//         int sign = 1;
//         if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
//             if (s.charAt(i) == '-')  sign = -1;
//             i++;
//         }

//         // Step 3: convert digits
//         long num = 0;
//         while (i < n && Character.isDigit(s.charAt(i))) {
//             num = num * 10 + (s.charAt(i) - '0');// ASCCI CONVERSION
//             // Step 4: handle overflow
//             if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
//             if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

//             i++;
//         }

//         return (int)(sign * num);
//     }
// }