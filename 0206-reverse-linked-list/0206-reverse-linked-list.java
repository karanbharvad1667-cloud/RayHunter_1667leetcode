class Solution {
    public ListNode reverseList(ListNode head) {
            // using recursion
            //tc=O(n)  space=O(n)
            if(head==null||head.next==null) return head; 
            ListNode a=head.next;
            head.next=null;
            ListNode b=reverseList(a);
            a.next=head;
            return b;


        // itrative way
        //tc=O(n)  space=O(1)
        //  if(head==null||head.next==null) return head;
        // ListNode c=head;
        // ListNode p=null;
        // ListNode f=null;
        // while(c!=null){
        //    f=c.next;
        //    c.next=p;
        //    p=c;
        //    c=f;
        // }
        // return p;
        


        //tc=O(n)  space=O(n)
        // if(head==null||head.next==null) return head;
        // ListNode temp=head;
        // ArrayList<ListNode>arr=new ArrayList<>();
        // while(temp!=null){
        //     arr.add(temp);
        //     temp=temp.next;
        // }
        // int n=arr.size();
        // for(int i=n-1;i>=1;i--){
        //     arr.get(i).next=arr.get(i-1);  
        // }
        // arr.get(0).next=null;
        // return arr.get(n-1);  
    } 
}