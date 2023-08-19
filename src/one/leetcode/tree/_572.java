package one.leetcode.tree;

public class _572 {
    public static void main(String[] args) {
        Integer[] arr = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode root = new TreeNode(arr);
        root.levelOrder();


    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //find where this
        if(subRoot==null || isSameTree(root,subRoot)) return true;
        else if(root==null) return false;

        return isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)  return true;
        else if(p==null || q==null) return false;


        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) &&  p.val == q.val;

    }
}
