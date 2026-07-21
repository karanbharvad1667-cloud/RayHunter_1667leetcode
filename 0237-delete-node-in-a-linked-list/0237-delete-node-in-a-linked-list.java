
class Solution {
    public void deleteNode(ListNode target) {
        target.val=target.next.val; // store value of next node in given accsessible node
        target.next=target.next.next;// this is delete statement
    }
}