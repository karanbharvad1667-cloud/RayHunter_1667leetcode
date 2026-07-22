public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int asize=0,bsize=0;
        while(temp1!=null){
            temp1=temp1.next;
            asize++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            bsize++;
        }

        ListNode fast=headA;
        ListNode slow=headB;
        int diff=Math.abs(asize-bsize);
        if(asize>bsize){
            for(int i=0;i<diff;i++){
                fast=fast.next;
            }
        }else{
             for(int i=0;i<diff;i++){
                slow=slow.next;
            }
        }  
        while(fast!=slow){
                    fast=fast.next;
                    slow=slow.next;
            }  
      return slow;
      
    } 
    
} 
