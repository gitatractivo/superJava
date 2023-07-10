package one.leetcode.tree;

public class _100 {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left=new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);
        System.out.println(isSameTree(p,q));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)  return true;
        else if(p==null || q==null) return false;


        boolean same = isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        boolean rev = isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
        if(((same)|| (rev))==false)    return false;

        return p.val == q.val;

    }
}
