package one.leetcode.tree;

import com.sun.source.tree.Tree;

public class _1302 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,4,7,null,null,null,5,null,null,3,null,6,null,8,null,null};
        TreeNode tree = new TreeNode(arr);
        tree.levelOrder();
        System.out.println(deepestLeavesSum(tree));
    }
    public static int deepestLeavesSum(TreeNode root) {
        int [] ans = rec(root);
        return ans[1];
    }
    public static int[] rec(TreeNode node){
        if(node == null) return new int[]{-1,-1};

        int[] left = rec(node.left);
        int[] right = rec(node.right);


        if(left[0]<right[0]  ){
            left = right;
        }
        else if(left[0]==right[0] && left[0]!=-1){
            left[1]+=right[1];
        }
        if(left[0]<0) return new int[]{0,node.val};

        return new int[]{left[0]+1,left[1]};

    }
}
