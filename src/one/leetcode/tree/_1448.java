package one.leetcode.tree;

public class _1448 {
    public static void main(String[] args) {
        Integer[] arr = {-1,5,-2,4,4,2,-2,null,null,-4,null,-2,3,null,-2,0,null,-1,null,-3,null,-4,-3,3,null,null,null,null,null,null,null,3,-3};
        TreeNode root = new TreeNode(arr);
        root.levelOrder();
    }
}
