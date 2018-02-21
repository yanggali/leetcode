/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0),biggerHead = new ListNode(0);
        ListNode smaller = smallerHead,bigger = biggerHead;
        while(head != null){
            if(head.val < x){
                smaller.next = head;
                smaller = smaller.next;
            }else{
                bigger.next = head;
                bigger = bigger.next;
            }
            head = head.next;
        }
        smaller.next = biggerHead.next;
        bigger.next = null;
        return smallerHead.next;
    }
}