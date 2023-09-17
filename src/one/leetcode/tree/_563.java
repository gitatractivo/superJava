package one.leetcode.tree;

public class _563 {
    public static void main(String[] args) {
        Integer[] arr  = {4,2,3,null,null,5,null,null,9,null,7,null,null};
        TreeNode tree = new TreeNode(arr);
        tree.levelOrder();
        System.out.println(findTilt(tree));
    }
    static int ans =0;

    public static int findTilt(TreeNode root) {
        rec(root);
        return ans;
    }


    public static int rec(TreeNode root){
        if(root == null) return 0;
        int left = 0, right = 0;
        if(root.left !=null){
            left = rec(root.left);

        }
        if(root.right != null){
            right = rec(root.right);

        }
        int val = root.val;
        ans += Math.abs(left-right);

        return left + right+ val;
    }
}
