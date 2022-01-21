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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        ListNode x = list1;
        ListNode y = list2;
        ListNode head = null;
        ListNode run = head;
      
        
        while(x!=null && y!=null){
            if(x.val < y.val){
               ListNode node = new ListNode(x.val , null); 
               if(run == null){
                   run  = node;
                   head = run;
               }
                else{
                    run.next = node;
                    run= run.next;
                }
                x = x.next;
            }else if(x.val > y.val){
              ListNode node = new ListNode(y.val , null); 
               if(run == null){
                   run  = node;
                   head = run;
               }
                else{
                    run.next = node;
                    run= run.next;
                    
                } 
                y = y.next;
            }  
            
            else{
                 ListNode node1 = new ListNode(x.val , null); 
                 ListNode node = new ListNode(y.val , node1); 
                 if(run == null){
                   run  = node;
                     head = run;
                     run = run.next;
                 }
                 else{
                    run.next = node;
                     run = run.next;
                     run= run.next;
                 } 
                 y = y.next;
                 x = x.next;
            }
            
        }
        
        
         if(x == null){
            while(y!=null){
              ListNode node = new ListNode(y.val , null); 
               if(run == null){
                   run  = node;
                   head = run;
               }
                else{
                    run.next = node;
                     run = run.next;
                } 
                y = y.next;  
            }
        }
        
        
        if(y == null){
            while(x!=null){
           ListNode node = new ListNode(x.val , null);   
               if(run == null){
                   run  = node;
                   head = run;
               }
                else{
                    run.next = node;
                    run = run.next;
                }
                x = x.next; 
            }
        }
       
        
        return head;
    }
}