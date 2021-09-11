/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//1.    ArrayList에 루트부터 모든노드 다 필요함. 전부 넣는다
//2. 키는 무조건 중간에 있다는 조건 활용 생각

//3. ListNode에 있는 해당 키의 next 연결을 끊는다 -> 연결을 끊는 법?
// root값을 유츄하거나 접근이 가능해야함.

class Solution {
    
    public void deleteNode(ListNode node) {
        //node = node.next;
        //node.next = node.next.next;
        //System.out.println(node.next.next.next.val);
        //ListNode tempNode = new ListNode();
        //tempNode.val = node.next.val;
        //System.out.println(tempNode.val);
        //node = tempNode;
        //System.out.println(node);
        //node = node.next;
        System.out.println(node.val);
        node.val = node.next.val;
        node.next = node.next.next;
        System.out.println(node.val);
        //node.next = node.next.next;
       // System.out.println(node);
        //System.out.println(node.val);
       // System.out.println(node.next);
        
        
        //System.out.println(node.next.val);
        
        //node.next = node.next.next;
        //System.out.println(node.next.val);
        
        
        //while(){
        //}
        
        //ArrayList<ListNode> nodeList = new ArrayList<ListNode>();
        //ArrayList<Integer> nodeList2 = new ArrayList<Integer>();
        
        
            
    }
}