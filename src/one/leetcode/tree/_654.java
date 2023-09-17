package one.leetcode.tree;

import java.util.Stack;

public class _654 {
    public static void main(String[] args) {
        System.out.println();
        TreeNode tree = constructMaximumBinaryTree(new int[]{3,2,1});
        tree.levelOrder();
    }
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        int in =0,max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                in=i;
                max=nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = rec(0,in,nums);
        root.right = rec(nums.length-1,in,nums);
        return root;
    }
    public static TreeNode rec(int s,int e,int[] nums){
        if(s==e) return null;
        TreeNode root = new TreeNode(nums[s]);
        if(s<e) root.right = rec(s+1,e,nums);
        else{
            root.left= rec(s-1,e,nums);
        }
        return root;
    }

}
