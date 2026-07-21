
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while( fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       
        return slow;
    }
}

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode temp=head;
//         ListNode t=head;
//         int size=0;
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }
//         int i=0;
//         while(i<size/2){
//             t=t.next;
//             i++;
//         }
//         return t;
//     }
// }