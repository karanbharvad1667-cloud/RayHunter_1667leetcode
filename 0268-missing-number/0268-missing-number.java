class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int sum=n*(n+1)/2;
        int arrsum=0;
        for(int ele:arr){
            arrsum+=ele;
        }
        return sum-arrsum;
    }
}