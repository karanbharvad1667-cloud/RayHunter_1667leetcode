class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=arr.length;
        int col=arr[0].length;
        int lo=0;
        int hi=(row*col)-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int midrow=mid/col;
            int midcol=mid%col;
            if(arr[midrow][midcol]==target) return true;
            else if(arr[midrow][midcol]>target) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}