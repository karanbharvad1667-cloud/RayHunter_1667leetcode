class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int ele:arr){
            set.add(ele);
            if(ele>max) max=ele;
            if(ele<min) min=ele;
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}