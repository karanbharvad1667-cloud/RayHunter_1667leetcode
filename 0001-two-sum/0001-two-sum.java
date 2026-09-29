class Solution {
    public int[] twoSum(int[] arr, int x) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
           int rem=x-arr[i];
           if(map.containsKey(rem)) return new int[]{i,map.get(rem)};
           map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}


// class Solution {
//     public int[] twoSum(int[] arr, int x) {
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==x) return new int[]{i,j};
//             }
//         }
//         return new int[]{-1,-1};
//     }
// }