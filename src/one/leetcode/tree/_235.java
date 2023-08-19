package one.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class _235 {
    public static void main(String[] args) {
        Integer[] arr = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode root = new TreeNode(arr);
        root.levelOrder();
        TreeNode ans = lowestCommonAncestor(root,new TreeNode(2),new TreeNode());
        System.out.println(ans.val);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> list1 = dfs(root,p);
        LinkedList<TreeNode> list2 = dfs(root,q);
        System.out.println(list1);
        System.out.println(list2);
        int i =list1.size()-1;
        int j = list2.size()-1;
        while(i-1>=0&& j-1>=0&&list1.get(i-1)==list2.get(j-1)){
            if(i==0||j==0)  return null;
            i--;
            j--;
        }



        return list1.get(i);
    }
    public static LinkedList<TreeNode> dfs(TreeNode root, TreeNode p){
        if(root==null) return new LinkedList<>();
        if(root.val == p.val){
            LinkedList<TreeNode> list = new LinkedList<>();
            list.add(root);
            return list;
        }
        LinkedList<TreeNode> left = dfs(root.left,p);
        LinkedList<TreeNode> right = dfs(root.right,p);
        if(!left.isEmpty()){
            left.add(root);
            return left;
        }
        else if (left.isEmpty()){
            right.add(root);
            return right;
        }

        return new LinkedList<>();

    }



}
