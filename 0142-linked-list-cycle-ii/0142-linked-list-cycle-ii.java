public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                while(temp!=slow){
                    temp=temp.next;
                    slow=slow.next;
                }
                return temp;
            }
        }
        return null;
    }
}