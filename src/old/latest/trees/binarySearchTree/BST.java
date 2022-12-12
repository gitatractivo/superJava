package old.latest.trees.binarySearchTree;



import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BST {
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
    private class Pair
    {
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }
    public BST(){}

    public BST(int[] arr){
        make(arr);
    }

    public void make(int[] arr){
        //if we are given an sorted array

        root = makeRec(arr,0,arr.length-1);

    }

    private Node makeRec(int[] arr, int l, int h) {
        if(l>h) return null;
        int mid = (l + h)/2;
        Node temp = new Node(arr[mid]);
        temp.left=makeRec(arr,l,mid-1);
        temp.right=makeRec(arr,mid+1,h);
        return temp;

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

    public int max(){
        return maxRec(root);
    }

    private int maxRec(Node node) {
        if(node.right!=null){
            return maxRec(node.right);
        }
        return node.value;
    }

    public int min(){
        return minRec(root);
    }

    private int minRec(Node node) {
        if(node.left!=null){
            return minRec(node.left);
        }
        return node.value;
    }

    public boolean find(int data){
        return findRec(root, data);
    }

    private boolean findRec(Node node, int data) {
        if(node==null)  return false;
        if(data> node.value){
            return findRec(node.right,data);
        }
        else if(data<node.value){
            return findRec(node.left,data);
        }
        return true;
    }

    public void add(int i){
        add(root,i);
    }
    private Node add(Node node, int i){
        if(node == null){
            return new Node(i);
        }
        if(i > node.value)  node.right =  add(node.right,i);
        else if(i < node.value)  node.left =  add(node.left,i);
        return node;
    }

    public void remove(int i){
        remove(root,i);
    }
    private Node remove(Node node, int i){
        if(node == null){
            return null;
        }
        if(i > node.value)  node.right =  remove(node.right,i);
        else if(i < node.value)  node.left =  remove(node.left,i);
        else{
            if(node.left!=null && node.right!=null){
                int maxOfLeft = maxRec(node.left);
                node.value = maxOfLeft;
                node.left=remove(node.left,maxOfLeft);

            }
            else if(node.left!=null ){
                return node.left;
            }
            else if(node.right!=null){
                return node.right;
            }
            else{
                return null;
            }
        }
        return node;
    }

    private Node maxRecNode(Node node) {
        if(node.right!=null){
            return maxRecNode(node.right);
        }
        return node;
    }

    public void sumOfLarger(){
//        Integer sum =0;
        sumOfLargerRec(root,0);
//        System.out.println(sum);
    }

    private int sumOfLargerRec(Node node,int sum) {
        if(node==null)  return sum;
        int temp = node.value;
        sum =  sumOfLargerRec(node.right,sum);
        node.value=sum;
        sum +=temp;
//        sum+=temp;
        sum= sumOfLargerRec(node.left,sum);
        return sum;


    }

    public void printRange(int low,int high){
        printRangeRec(root,low,high);
    }

    private void printRangeRec(Node node, int low, int high) {
        if(node==null)  return;
        if(node.value> low &&  node.value>high){
            printRangeRec(node.left,low,high);
        }
        else if(node.value< low &&  node.value<high){
            printRangeRec(node.right,low,high);
        }
        else{
            printRangeRec(node.left,low,high);
            System.out.println(node.value);
            printRangeRec(node.right,low,high);

        }
    }

    public void lca(int node1,int node2){
        ArrayList<Integer> list1 = pathRec(root,node1);
        ArrayList<Integer> list2 = pathRec(root,node2);
        int ans = -1;
        for (int i = 0; i < list1.size() && i<list2.size(); i++) {
            if(list1.get(i)==list2.get(i)){
                ans=list1.get(i);
            }
            else    break;
        }
        System.out.println(ans);
    }

    private ArrayList<Integer> pathRec(Node node, int i){
        if(node==null)  return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(node.value==i)   list.add(node.value);
        else{
            ArrayList<Integer> temp = pathRec(node.left,i);
            if(!temp.isEmpty()){
                list.add(node.value);
                list.addAll(temp);
            }
            else{
                temp = pathRec(node.right,i);
                if(!temp.isEmpty()){
                    list.add(node.value);
                    list.addAll(temp);
                }
            }

        }
        return list;
    }

    public int leastCommonAncestor(int node1,int node2){
        return lcaRec(root,node1,node2);
    }

    private int lcaRec(Node node, int node1, int node2) {
        if(node.value>node1 && node.value>node2){
            return lcaRec(node.left,node1,node2);
        }
        else if(node.value<node1 && node.value<node2){
            return lcaRec(node.right,node1,node2);
        }
        return node.value;
    }


}
