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
    public ListNode reverseList(ListNode head) {
        
        ListNode current = head;
        ListNode prev = null;
        ListNode newhead = null;
        while(head!=null){
            ListNode newnode = new ListNode(head.val , null);
            if(prev == null){
                prev = newnode;
            }else{
                newnode.next = prev;
                prev=newnode;
            }
            newhead = newnode;
            head = head.next;
        }
       return newhead; 
    }
}