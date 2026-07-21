
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode t=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        size=(size/2);
        int i=0;
        while(i<size){
            t=t.next;
            i++;
        }
        return t;
    }
}