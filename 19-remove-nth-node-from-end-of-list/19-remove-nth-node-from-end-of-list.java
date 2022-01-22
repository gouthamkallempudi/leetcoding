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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode forward = head;
        ListNode back = head;
        int i =0;
        while(i<n){
            forward = forward.next;
            i++;
        }
        if(forward == null){
            head = head.next;
            return head;
        }
        
        while(forward!=null){
           
            forward = forward.next;
            
            if(forward==null){
                back.next = back.next.next;
                return head;
            }
            back = back.next;
        }
     return head;   
    }
}