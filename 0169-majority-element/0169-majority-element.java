class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n =arr.length;
        for(int x:arr){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);

            if(map.get(x)>n/2) return x;
        }
        return -1;
    }
}


//tc=O(n^2)
// class Solution {
//     public int majorityElement(int[] arr) {
//         int n=arr.length;
//         int maxele=0;
//         for(int i=0;i<n;i++){ 
//             int count=0;
//             for(int j=i;j<n;j++){
//                 if(arr[i]==arr[j]) count++;
//             }
//             if(count>n/2) maxele=arr[i]; 
//         }
//        return maxele;
//     }
// }