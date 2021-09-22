/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// depth를 코드로 어떻게 비교할지
// 1.right와 left가 null이면 리프노드임을 확인 가능
// 2.root는 제외
// 3.depth ,parents
// 재귀 호출할때 input root의 
// depth는 0 input으로 0을 받음 
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        int depth = 0;    
        TreeNode parents = root;
        ArrayList<Integer> map = new ArrayList<Integer>();
        ArrayList<Integer> map2 = new ArrayList<Integer>();
        search(root, depth , map , parents , x);
        search(root, depth , map2 , parents , y);
       for(Integer i : map) { //for문을 통한 전체출력
            System.out.println(i);
        }
       for(Integer i : map2) { //for문을 통한 전체출력
            System.out.println(i);
        }
        
        //parents가 다르고 depth가 같으면 true 아니면 false판별
           if(map.get(0)==map2.get(0) && map.get(1) != map2.get(1)){
                return true;
           }else{
               return false;
           }
    }
    
    //depth,parents
    public void search(TreeNode root , int depth , ArrayList map , TreeNode parents , int num){
        if(num == root.val){
            map.add(depth);
            map.add(parents.val);
        }
        depth++;            
        if(root.left != null){
            search(root.left,depth,map,root,num);
        }   
        if(root.right != null){
            search(root.right,depth,map,root,num);
        }
    }
}