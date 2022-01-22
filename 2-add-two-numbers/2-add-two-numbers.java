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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode x = l1;
        ListNode y = l2;
        
        ListNode newnode = null;
        ListNode current = null;
        int rem  =0;
        while(x!=null && y!=null){
            ListNode q = new ListNode((rem + x.val+y.val) % 10 , null);
            rem =  (rem + x.val+y.val) / 10;
            if(newnode == null){
                newnode = q;
                current = newnode;
            }else{
                current.next = q;
                current = q;
            }
            x = x.next;
            y=y.next;
        }
        
        while(x!=null){
           ListNode q = new ListNode((rem + x.val) % 10 , null);
            rem =  (x.val+rem) / 10;
            if(newnode == null){
                newnode = q;
                current = newnode;
            }else{
                current.next = q;
                current = q;
            }
            x = x.next;
        }
        
        while(y!=null){
            ListNode q = new ListNode((rem + y.val) % 10 , null);
            rem =  (y.val+rem) / 10;
            if(newnode == null){
                newnode = q;
                current = newnode;
            }else{
                current.next = q;
                current = q;
            }
            y = y.next;
        }
        
        if(rem!=0){
             ListNode q = new ListNode(rem , null); 
             current.next = q;
        }
        
        return newnode;
    }
}