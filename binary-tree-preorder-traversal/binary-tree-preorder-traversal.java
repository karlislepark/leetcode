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
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        // root. left.root right.root right. left
        // 변수는 null 일경우 
        List<Integer> returnVal = new ArrayList<>();
        if(root == null){
            return returnVal; //
        }
        returnVal.add(root.val);
       // preorderTraversal(root.left); //listInteger
       // preorderTraversal(root.right); //listInteger
        System.out.println("left === " + preorderTraversal(root.left));
        System.out.println("right === " + preorderTraversal(root.right));
        returnVal.addAll(preorderTraversal(root.left));
        returnVal.addAll(preorderTraversal(root.right));
        //root의 left root의 right
        //재귀호출해서 root.left넣는다고하면 list<Integer>를 treenode타입으로 만들 메서드 필요
        
        return returnVal;
    }
}