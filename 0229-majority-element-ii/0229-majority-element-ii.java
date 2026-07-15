class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                ans.add(key);
            }
        }
        return ans;
    }
}