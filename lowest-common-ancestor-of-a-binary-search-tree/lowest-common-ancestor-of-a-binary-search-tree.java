/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> intListP = new ArrayList<Integer>();
        List<Integer> intListQ = new ArrayList<Integer>();
        List<TreeNode> listP = new ArrayList<TreeNode>();
        List<TreeNode> listQ = new ArrayList<TreeNode>();
       
        searchNodes(listP, root, p);
        searchNodes(listQ, root, q);
       
       searchNodes2(intListP, root, p);
       searchNodes2(intListQ, root, q);
        System.out.println(intListP);
        System.out.println(intListQ);
       TreeNode a = new TreeNode();
        for(int i = 0; i < listP.size(); i++){
            for(int j = 0; j < listQ.size(); j++){
                if(listP.get(i) == listQ.get(j)){
                    System.out.println(intListP.get(i) +" = "+ intListQ.get(j));
                    a = listP.get(i);
                    
                }
            }
        }
       
       //return이 treenode로 되어야해서 add treenode로 변경
       //return "Exception";
       return a;
    }
    //해당 메소드의 목적은 키까지 가는 모든 노드들의 val를 리스트에 넣는 것이다.
    public void searchNodes(List<TreeNode> list, TreeNode root, TreeNode key) {
        if (root.val < key.val) {
            list.add(root);
            searchNodes(list, root.right, key);
        } else if (root.val > key.val) {
            list.add(root);
            searchNodes(list, root.left, key);
        } else if (root.val == key.val) {
            list.add(key);
        }else {
            return;
        }
    }
    public void searchNodes2(List<Integer> list, TreeNode root, TreeNode key) {
        if (root.val < key.val) {
            list.add(root.val);
            searchNodes2(list, root.right, key);
        } else if (root.val > key.val) {
            list.add(root.val);
            searchNodes2(list, root.left, key);
        } else if (root.val == key.val) {
            list.add(key.val);
        }else {
            return;
        }
    }
    
}