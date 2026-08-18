class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            // if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            // else map.put(ele,1);
            map.put(ele,map.getOrDefault(ele,0)+1);
            if(map.get(ele)==(n/3)+1) ans.add(ele);
        }
        // for(int key : map.keySet()){
        //    if(map.get(ele)==(n/3)+1) ans.add(ele);
        // }
        return ans;
    }
} 