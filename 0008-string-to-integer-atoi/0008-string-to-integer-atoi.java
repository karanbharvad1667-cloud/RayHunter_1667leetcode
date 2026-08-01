class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        // Step 1: skip leading spaces
        while (i < n && s.charAt(i) == ' ')   i++;

        // Step 2: check sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-')  sign = -1;
            i++;
        }

        // Step 3: convert digits
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            // Step 4: handle overflow
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * num);
    }
}