class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int n=arr.length;
        int count=0;
        int presum=0;
        for(int i=0;i<n;i++){
           presum+=arr[i];
           int remove=presum-k;
           if(map.containsKey(remove)) count+=map.get(remove);
           map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}

// class Solution {
//     public int subarraySum(int[] arr, int k) {
//         int n=arr.length;
//         int count=0;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];
//                 if(sum==k) count++;
//             }
//         }
//         return count;
//     }
// }