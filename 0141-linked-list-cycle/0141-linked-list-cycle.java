public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            if(fast.next==slow) return true;
            else{
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        return false;
    }
}