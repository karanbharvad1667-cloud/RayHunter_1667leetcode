class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode x = dummy;

        int carry = 0;
        while (temp1 != null || temp2 != null) {
            int a = (temp1 != null) ? temp1.val : 0;
            int b = (temp2 != null) ? temp2.val : 0;

            int val = a + b + carry;

            carry = val / 10;

            ListNode node = new ListNode(val % 10);
            dummy.next = node;
            dummy = node;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }
        if (carry != 0) dummy.next = new ListNode(carry);
        return x.next;
    }
}