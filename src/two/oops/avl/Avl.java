package two.oops.avl;

import java.util.ArrayDeque;
import java.util.Queue;

public class Avl {
    private Node root;

    private class Node{
        private int value;
        private Node left, right;
        int height = 0;

        public Node(int value) {
            this.value = value;
        }
        public Node(){

        }

        @Override
        public String toString() {
            return  value + "";
        }
    }

    public int height(){
        return heightRec(root);
    }
    private int heightRec(Node parent){
        if(parent==null)    return 0;
        return Math.max(heightRec(parent.left), heightRec(parent.right)) +1;
    }

    public void levelOrder(){
        levelOrderRec(root);
    }
    private void levelOrderRec(Node node){
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        while(!que.isEmpty()){
            int count = que.size();
            for (int i = 0; i < count; i++) {
                node = que.remove();
                System.out.print(node + "  ");
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
            }
            System.out.println();
        }

    }

    public void display(){
        displayRec(root);
    }
    private void displayRec(Node parent){
        if(parent==null)    return;
        String str = "";
        str+= parent.left==null? ".": parent.left + "";
        str+= "<-" + parent + "->";
        str+= parent.right==null? ".": parent.right + "";
        System.out.println(str);
        displayRec(parent.left);
        displayRec(parent.right);
    }

    public void insert(int val){
        root=insertRec(root,val);
    }

    private Node insertRec(Node node,int val) {
        if(node==null)  return new Node(val);
        if(val==node.value) return node;
        else if(val>node.value){
            node.right=insertRec(node.right,val);
        }
        else{
            node.left=insertRec(node.left,val);
        }

        node.height=Math.max(heightRec(node.left),heightRec(node.right))+1;
        int balance = getBalance(node);

        //rotation if found unbalanced
        if(balance<-1 && val>node.right.value){
            return rightRotation(node);
        }
        if(balance>1 && val<node.left.value){
            return leftRotation(node);
        }
        if(balance<-1 && val<node.right.value){
            node.right=leftRotation(node.right);
            return rightRotation(node);
        }
        if(balance>1 && val>node.right.value){
            node.left=rightRotation(node.right);
            return leftRotation(node);
        }

        return node;

    }

    private int getBalance(Node node){
        return heightRec(node.left)-heightRec(node.right);
    }

    private Node leftRotation(Node node){
        Node temp = node;
        node = node.left;
        Node temp2=node.right;
        node.right=temp;
        temp.left=temp2;
        return node;
    }
    private Node rightRotation(Node node){
        Node temp = node;
        node = node.right;
        Node temp2=node.left;
        node.left=temp;
        temp.right=temp2;
        return node;
    }

    public void delete(int val){
        root=deleteRec(root,val);
    }

    private Node deleteRec(Node node,int val) {
        if(node==null)  return null;

        if(val>node.value){
            node.right=deleteRec(node.right,val);
        }

        else if(node.value>val){
            node.left=deleteRec(node.left,val);
        }

        else{
            //if both child are there then go to the left node and get maximum
            if(node.left!=null && node.right!=null){
                int maxValLeft = maxRec(node.left).value;
                node.value=maxValLeft;
                node.left=deleteRec(node.left,maxValLeft);
            }
            //if just
            else if(node.left!=null){
                node = node.left;
            }
            else if(node.right!=null){
                node=node.right;
            }
            else{
                return null;
            }
        }
        node.height=Math.max(heightRec(node.left),heightRec(node.right))+1;
        int balance = getBalance(node);

        //rotation if found unbalanced
        if(balance<-1 && getBalance(node.right)<=0){
            return rightRotation(node);
        }
        if(balance>1 && getBalance(node.right)>=0){
            return leftRotation(node);
        }
        if(balance<-1 && getBalance(node.right)>0){
            node.right=leftRotation(node.right);
            return rightRotation(node);
        }
        if(balance>1 && getBalance(node.right)<0){
            node.left=rightRotation(node.right);
            return leftRotation(node);
        }

        return node;
    }


    private Node maxRec(Node node){
        if(node.right!=null){
            return maxRec(node.right);
        }
        return node;
    }
}
