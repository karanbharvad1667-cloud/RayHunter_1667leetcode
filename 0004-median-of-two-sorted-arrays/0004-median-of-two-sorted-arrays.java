class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        double[] a=merge(arr1,arr2);
        int len=a.length;
        int mid=len/2;

        if(len==1) return a[0];
        if(len%2==0) return ((a[mid]+a[mid-1])/2);
        else return a[mid];   
        
    }

    public double[] merge(int[]arr,int []brr){
        int n=arr.length,m=brr.length;
        double c[]=new double[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(arr[i]<=brr[j]) c[k++]=arr[i++];   
            else c[k++]=brr[j++];
        }
        while(i<n) c[k++]=arr[i++];
        while(j<m) c[k++]=brr[j++];

        return c;
    }
}