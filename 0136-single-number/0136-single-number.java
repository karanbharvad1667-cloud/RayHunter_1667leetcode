class Solution {
    public int singleNumber(int[] arr) {
        int num=0;//because 0^x=x
        for(int ele:arr)num^=ele;      
        return num;
    }
}