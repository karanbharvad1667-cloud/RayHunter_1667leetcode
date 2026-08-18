// optimal tc=(n) space=(1) moous algoritham
class Solution {
    public int majorityElement(int[] arr) {
        int n =arr.length;
        int count=0;
        int ele=0;
        for(int x:arr){
            if(count==0){
                ele=x;
                count=1;
            }else if(x==ele){
                count++;
            }else{
                count--;
            }
        }
        int cnt=0;
        for(int y:arr){
            if(ele==y) cnt++;
        }
        if(cnt>n/2) return ele;
        return -1;
    }
}
// // better tc=(n) space=(n)
// class Solution {
//     public int majorityElement(int[] arr) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int n =arr.length;
//         for(int x:arr){
//             if(map.containsKey(x)) map.put(x,map.get(x)+1);
//             else map.put(x,1);//map.put(x,map.getOrDefault(x,0)+1)

//             if(map.get(x)>n/2) return x;
//         }
//         return -1;
//     }
// }


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