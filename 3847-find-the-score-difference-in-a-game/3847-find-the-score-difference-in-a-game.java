class Solution {
    public int scoreDifference(int[] nums) {

        int fp = 0;
        int sp = 0;

        int active = 1; // 1 = first active, 0 = second active

        for (int i = 0; i < nums.length; i++) {

            // Rule 1: swap if odd
            if (nums[i] % 2 == 1) {
                active ^= 1;   // flip between 1 and 0
            }

            // Rule 2: swap every 6th game (index 5, 11, 17...)
            if (i % 6 == 5) {
                active ^= 1;
            }

            // Give points to active player
            if (active == 1) {
                fp += nums[i];
            } else {
                sp += nums[i];
            }
        }

        return fp - sp;
    }
}