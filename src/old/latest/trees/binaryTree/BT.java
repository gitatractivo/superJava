package old.latest.trees.binaryTree;

import java.util.*;

public class BT {
    private Node root;
    private class Node{
        private int value;
        private Node left, right;

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
    private class Pair{
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }
    public BT(){}

    public BT(Integer[] arr){
        make(arr);
    }

    public void make(Integer[] arr){
        int i = 0;
        Stack<Pair> st = new Stack<>();
        root=new Node(arr[i++]);
        st.push(new Pair(root,0));
        while(!st.isEmpty() && i< arr.length){
            Pair top = st.peek();
            if(top.state==0){
                if(arr[i]!=null){
                    Node temp = new Node(arr[i]);
                    int v = temp.value;
                    top.node.left= temp;
                    st.push(new Pair(temp,0));
                }
                top.state++;
                i++;
            }
            else if(top.state==1){
                if(arr[i]!=null){
                    Node temp = new Node(arr[i]);
                    top.node.right= temp;
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
    public int max(){
        return maxRec(root);
    }
    private int maxRec(Node parent){
        if(parent==null)    return 0;
        int max = Math.max(parent.value, maxRec(parent.left));
        return Math.max(max, maxRec(parent.right));
    }
    public int height(){
        return heightRec(root);
    }
    private int heightRec(Node parent){
        if(parent==null)    return 0;
        return Math.max(heightRec(parent.left), heightRec(parent.right)) +1;
    }
    public int sum(){
        return sumRec(root);
    }
    private int sumRec(Node parent){
        if(parent==null)    return 0;
        return sumRec(parent.left)+ sumRec(parent.right) + parent.value;
    }
    public int size(){
        return sizeRec(root);
    }
    private int sizeRec(Node parent){
        if(parent==null)    return 0;
        return sizeRec(parent.left)+ sizeRec(parent.right) + 1;
    }


    public void traversals(){
        travers(root);
    }

    private void travers(Node node) {
        if(node==null)  return;
        System.out.println("Pre: " + node);
        travers(node.left);
        System.out.println("In: " + node);
        travers(node.right);
        System.out.println("Post: " + node);

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

    public void iterativeTraversal(){
        iteratTrev(root);
    }

    private void iteratTrev(Node root) {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,0));
        String pre ="";
        String in ="";
        String post ="";

        while(!st.isEmpty()){
            Pair top = st.peek();
            if(top.state==0){
                //pre
                top.state++;
                pre+=top.node.value+" ";
                if(top.node.left!=null)     st.push(new Pair(top.node.left,0));

            }
            else if(top.state==1){
                //in
                top.state++;
                in+=top.node.value + " ";
                if(top.node.right!=null)     st.push(new Pair(top.node.right,0));
            }
            else{
                //post
                post+=top.node.value + " ";
                st.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);

    }

    public void path(int i){
        ArrayList<String> list = pathrec(root,i);
        String ans = "";
        for (String s:list) {
            ans+=s;
        }
        System.out.println(ans);
//        System.out.println(pathrecint(root,i));
    }

    private ArrayList<String> pathrec(Node node, int i) {

        if(node == null){
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if(node.value==i){
            list.add(node.value + "");

        }
        else{
            ArrayList<String> temp = pathrec(node.left,i);
            if(!temp.isEmpty()){
                list.add(node.value +" -> (left) " );
                list.addAll(temp);

            }
            else{
                temp = pathrec(node.right,i);
                if(!temp.isEmpty()){
                    list.add(node.value +" -> (right) " );
                    list.addAll(temp);

                }
            }


        }
        return list;
    }

    private ArrayList<Node> pathrecNode(Node node, int i) {
        //this returns every node from itself to root
        if(node == null){
            return new ArrayList<>();
        }
        ArrayList<Node> list = new ArrayList<>();
        if(node.value==i){
            list.add(node);

        }
        else{
            ArrayList<Node> temp = pathrecNode(node.left,i);
            if(!temp.isEmpty()){
                list.addAll(temp);
                list.add(node);

            }
            else{
                temp = pathrecNode(node.right,i);
                if(!temp.isEmpty()){
                    list.addAll(temp);
                    list.add(node);

                }
            }


        }
        return list;
    }

    public void reverse(){
        reverseRec(root);
    }

    private void reverseRec(Node node) {
        if(node==null)  return;
        Node temp = new Node();
        temp.left= node.left;
        node.left = node.right;
        node.right=temp.left;
        reverseRec(node.left);
        reverseRec(node.right);
    }

    public void kdown(int k){
         kdownrec(root,k);
    }
    private void kdownrec(Node node,int k){
        if(node==null)  return;
        if(k==0){
            System.out.print(node + "  ");
        }

        kdownrec(node.left,k-1);
        kdownrec(node.right,k-1);
    }

    //check this
    public void kdownfar(int i,int k){
        //find node which has value i and print k levels down from it
        ArrayList<Node> path = pathrecNode(root,i);
        for (int j = 0; j < path.size() && i<=k; j++) {
            kdownrec(path.get(i),k-1);
        }

    }

    private Node findNode(Node node,int i) {
        if(node == null)    return null;
        if(node.value==i)   return node;
        Node temp = findNode(node.left,i);
        if(temp == null)    temp = findNode(node.right,i);
        return temp;
    }

}
