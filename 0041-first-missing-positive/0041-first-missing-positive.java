/*class Solution {
    // brute force o(n^2)
    public int firstMissingPositive(int[] arr) {
    for (int x = 1; x <= n; x++) {
    boolean found = false;
    for (int ele : arr) {
        if (ele == x) {
            found = true;
            break;
        }
    }
    if (!found)return x;     
   }
}
    // sorting approach tc =O(nlogn)
    public int firstMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans) ans++;
        }
        return ans;
    }

*/
//   using cyclic sort tc=o(n) space o(1)
class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        int i=0;
        // this is the approach of cyclic sort
        while(i<n){         
          if(arr[i]==i+1  ||  arr[i]<=0  || arr[i]>n|| arr[i]==arr[arr[i]-1]) i++;
          //1.position 2.negative or zero 3.if value>n we can not place it 4.correct position
          else{
            swap(arr,i,arr[i]-1);
          }
        }
        for(i=0;i<n;i++){
         if(arr[i]!=i+1)return i+1;// i+1 becaouse o based indexing
        }
        return n+1;
    }
    public void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
 