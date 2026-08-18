// optimal tc=(2n) space (1)
class Solution {
    public List<Integer> majorityElement(int[] arr) {
       List<Integer> ans=new ArrayList<>();
       int n=arr.length;
       int cnt1=0,cnt2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt1==0&& arr[i]!=ele2){
                cnt1=1;
                ele1=arr[i];
            }else if(cnt2==0 && arr[i]!=ele1){
                cnt2=1;
                ele2=arr[i];
            }else if(arr[i]==ele1){
             cnt1++;     
            }else if(arr[i]==ele2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
       cnt1=0;
       cnt2=0;
       for(int i=0;i<n;i++){
        if(arr[i]==ele1) cnt1++;
        if(arr[i]==ele2) cnt2++;
       }
       if(cnt1>n/3) ans.add(ele1);
       if(cnt2>n/3) ans.add(ele2);
       ans.sort(null);;
        
       return ans;
    }
}

// better (n) sp=(n)
// class Solution {
//     public List<Integer> majorityElement(int[] arr) {
//         int n=arr.length;
//         List<Integer> ans=new ArrayList<>();
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int ele:arr){
//             // if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
//             // else map.put(ele,1);
//             map.put(ele,map.getOrDefault(ele,0)+1);
//             if(map.get(ele)==(n/3)+1) ans.add(ele);
//         }
//         // for(int key : map.keySet()){
//         //    if(map.get(ele)==(n/3)+1) ans.add(ele);
//         // }
//         return ans;
//     }
// } 

// // bruteforce tc=(n^2) space (1)
// class Solution {
//     public List<Integer> majorityElement(int[] arr) {
//         int n=arr.length;
//         List<Integer> ans=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             if(ans.size()==0||ans.get(0)!=arr[i]){
//                 int count=0;
//                 for(int j=0;j<n;j++){
//                     if(arr[i]==arr[j]) count++;
//                 }
//                 if(count>n/3) ans.add(arr[i]);
//             }
//             if(ans.size()==2) break;
//         }
//         return ans;
//     }
// } 
