package one.leetcode.tree;

import java.time.temporal.Temporal;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
      TreeNode(Integer[] arr){
          this(arr[0]);
          int i =1;
          Stack<Pair> st = new Stack<>();
          st.add(new Pair(this,0));
          while(!st.isEmpty() && i<arr.length){
              Pair top = st.peek();
              if(top.state==0){
                  if (arr[i]!=null){
                      TreeNode temp = new TreeNode(arr[i]);
                      top.node.left = temp;
                      st.push(new Pair(temp,0));

                  }
                  top.state++;
                  i++;
              }
              else if(top.state==1){
                  if (arr[i]!=null){
                      TreeNode temp = new TreeNode(arr[i]);
                      top.node.right = temp;
                      st.push(new Pair(temp,0));

                  }
                  top.state++;
                  i++;

              }
              else{
                  st.pop();
              }

          }
      }

      private class Pair{
          TreeNode node;
          int state;

          public Pair(TreeNode node, int state) {
              this.node = node;
              this.state = state;
          }
      }



      public void levelOrder(){
          Queue<TreeNode> que = new ArrayDeque<>();
          que.add(this);
//          int space = height();
          while(!que.isEmpty()){
//              for (int i = 0; i < space; i++) {
//                  System.out.print("\t");
//              }
//              space--;

              int count = que.size();
              for (int i = 0; i < count; i++) {
//                  System.out.println(count+"count");
                  TreeNode top = que.remove();
                  System.out.print(top.val+"\t");

                  if(top.left!=null){
                      que.add(top.left);
                  }
                  if(top.right!=null){
                      que.add(top.right);
                  }
              }
              System.out.println();
          }
      }

      public int height(){
          return heightRec(this);
      }
      private int heightRec(TreeNode parent){
          if(parent==null)    return -1;
          return Math.max(heightRec(parent.left), heightRec(parent.right)) +1;
      }

    @Override
    public String toString() {
        return val+"";
    }
}
