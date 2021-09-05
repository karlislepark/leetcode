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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> hash = new ArrayList<Integer>();
        //array로 바꾼 후 length가 짝수면 앞뒤 확인 홀수면 앞뒤 확인 후 가운데 확인
        while(head != null) {
                hash.add(head.val); 
				head = head.next;
			}
        for(Integer i : hash) { //for문을 통한 전체출력
            System.out.println(i);
        }
         for(int i = 0; i < hash.size(); i++){
             int temp = hash.size()-1-i;
            //arraylist 사이즈만큼 돌면서 0번쨰랑 size -1 1번쨰랑 size -2 , i번째랑 size-1-i
            //index가 같아지거나 오른쪽 인덱스가 왼쪽인덱스보다 작아질 때 
            // ex) 11311 일 때 i = 1 i = 3 비교 1 - 3  3 - 1
            // hash[i]와 hash[size -1] 의 값이 같고 .... hash[i++]와 hash[size-1 --]의 값이 같으면 true 아니면 false
            //틀리면 false 같으면 
             if(i >= temp){ 
                return true;
             }else{
                if(hash.get(i) != hash.get(temp)){
                    return false;
                }
             }    
             
             
             //if(i >= hash.size()-1){ // 크로스 확인
             //    
             //}
             
           //hash[i++] 두값이 같으면 더돌고 아니면 false hash[temp--] 돌면서 index확인하는데 index가 왼쪽이 더 커지거나 같으면 다 돌았고 true
         }
            return true;
    }
}

 
