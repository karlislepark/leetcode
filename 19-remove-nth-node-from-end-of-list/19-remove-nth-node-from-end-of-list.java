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
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode returnVal = new ListNode();
        ListNode next = head;
        list.add(next.val);
        while(next.next != null){
            next = next.next;
            list.add(next.val);
        }
        int size = list.size();
        
        if (size > 1) {
            ListNode curNode = returnVal;
            int count = 0;
            for(int i = 0; i < size; i++){
                if (i != size - n) {
                    curNode.val = list.get(i);
                    count++;
                    if (count != size - 1) {
                        curNode.next = new ListNode();
                        curNode = curNode.next;
                    }
                }
            }
            return returnVal;
        } else {
            return null;
        }
    }
}