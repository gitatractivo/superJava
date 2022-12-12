package two.oops;

import java.util.ArrayList;
import java.util.List;

public class _894 {
    public static void main(String[] args) {
        allPossibleFBT(7);
    }
    static ArrayList<TreeNode> list = new ArrayList<>();

    public static List<TreeNode> allPossibleFBT(int n) {
        if(n%2==0)  return new ArrayList<>();
        TreeNode root = new TreeNode(0);
        helper(root,root,n-1);
        return list;
    }
    public static void helper(TreeNode root,TreeNode node,int n){


        node.left=new TreeNode(0);
        node.right=new TreeNode(0);
        n-=2;

        if(n==0){
            TreeNode temp = root;
            list.add(temp);
            return;

        }
        helper(root,node.left,n);
        helper(root,node.right,n);
    }
}

