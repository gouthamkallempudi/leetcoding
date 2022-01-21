/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode x = head;
        ListNode x2 = head;
        while(x.next!= null && x2.next!=null && x2.next.next!=null){
            x2 = x2.next.next;
            x = x.next;  
            if(x == x2){
                return true;
            }
        }
        return false;
        
    }
}