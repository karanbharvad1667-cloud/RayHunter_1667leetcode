class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans=new ArrayList<>();
        if (arr == null || arr.length == 0) return ans;
        int n=arr.length;
        int m=arr[0].length;
        int rs=0;
        int cs=0;
        int re=n-1;
        int ce=m-1;
        while(cs<=ce && rs<=re){
            //1 rs-->ce
            for(int i=cs;i<=ce;i++){
                ans.add(arr[rs][i]);   
            }
             rs++;
            //2 ce-->re
            for(int i=rs;i<=re;i++){
                ans.add(arr[i][ce]);
            }
            ce--;
            //3 ce-->cs
            if(rs<=re){
            for(int i=ce;i>=cs;i--){ 
                ans.add(arr[re][i]);     
               }
            }
            re--;
            // 4re-->rs
            if(cs<=ce){
            for(int i=re;i>=rs;i--){
                ans.add(arr[i][cs]);     
            }
            cs++;
         }
        }
        return ans;
    }
}