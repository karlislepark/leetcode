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
    //String rootString = ""; 
    //String leftString = "";
    //String rigtString = "";
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> returnVal = new ArrayList<String>();
        String leftString = "";
        //String rightString = "";
        
        addList(root , leftString , returnVal);
        //addList(root , rightString);
        //System.out.println(addList(root , leftString));
        
        //returnVal.add(Integer.toString(root.val)+"->"+Integer.toString(root.left.val)+"->"+"5");
        //returnVal.add(Integer.toString(root.val)+"->"+Integer.toString(root.right.val));
        
        //returnVal.add(Integer.toString(root.val));
        //int index = returnVal.indexOf(Integer.toString(root.val));
        //returnVal.add(index,"->"+Integer.toString(root.left.val));
        return returnVal;
    }
    
    //x order로 돌면서 leaf 일때까지 list에 넣는 메소드  
    
    // 1. rootval + 
    // 2. left가 null이아니면 root의 left를 넣는데 재귀할때 root 다시들어감.
    public void addList(TreeNode root , String inputString , List<String> returnVal){
        
        inputString = inputString.concat(Integer.toString(root.val));
        //System.out.println("concat root=="+inputString);
        
        if(root.left != null){
            inputString = inputString.concat("->");
            addList(root.left , inputString , returnVal);
        }
        
        if(root.right != null){
            if(root.left == null){
                 inputString = inputString.concat("->");    
            }
            addList(root.right , inputString , returnVal);
        }
        
        if(root.left == null && root.right == null){
            returnVal.add(inputString);
        }
        //System.out.println("inputStringVal=== "+inputString);
        //return inputString;
         
    }
}