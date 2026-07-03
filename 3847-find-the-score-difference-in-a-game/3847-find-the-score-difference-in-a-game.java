class Solution {
    public int scoreDifference(int[] nums) {
        int fp = 0,sp = 0;
        int active = 1; // 1 = first active, 0 = second active
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1)  active ^= 1;  
            if (i % 6 == 5) active ^= 1;
            if (active == 1) fp += nums[i];   
            else  sp += nums[i];     
       } 
        return fp - sp;
    }
}