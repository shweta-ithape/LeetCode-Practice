/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;

        int count = 0;

        while(temp != null && count < k){
            temp = temp.next;
            count++;
        }

        if(count < k){
            return head;
        }

        ListNode prevNode = reverseKGroup(temp,k);

        ListNode curr = head;
        while(count > 0){
            ListNode next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr= next;
            count--;
        }
        return prevNode;
    }
}