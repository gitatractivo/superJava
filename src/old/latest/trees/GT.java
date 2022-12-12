package old.latest.trees;

import old.latest.trees.binaryTree.BT;

import java.util.*;

public class GT implements Iterable<Integer> {
    public GT() {
    }
    private Node root;



    private class Node{
        private final int value;
        private final ArrayList<Node> children = new ArrayList<>();

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return  value + "";
        }
    }
    public void add(int[] arr){

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == -1 && !st.empty()){
                st.pop();
            }
            else{
                Node temp = new Node(arr[i]);
                if (st.empty()){
                    root = temp;
                }
                else{
                    st.peek().children.add(temp);
                }
                st.push(temp);

            }
        }
    }





    @Override
    public Iterator<Integer> iterator() {
        return new Itr(root);
    }
    private class Itr implements Iterator<Integer>{
        Integer nextValue;
        Stack<Pair> st;
        public Itr(Node root) {
            st = new Stack<>();
            st.push(new Pair(root,-1));
            next();//the default value of nextValue right now when this constructor is called is null hence right now also hasNext will give false
            //hence calling next value for the first time this sets nextValue to the value of root which will be returned first time

        }

        @Override
        public boolean hasNext() {
            return nextValue!=null;
        }

        @Override
        public Integer next() {
            Integer ans = nextValue;
            //now nextValue moves forward, and if there is no value further than it sets next value -1
            nextValue=null;
            while(!st.isEmpty()){
                Pair top = st.peek();
                if(st.peek().state==-1){
                    nextValue=top.node.value;
                    top.state++;
                    break;
                }
                else if(top.state==top.node.children.size()){
                    st.pop();
                }
                else{
                    st.push(new Pair(top.node.children.get(top.state),-1));
                    top.state++;

                }
            }
            return ans;
        }
    }
    public void display(){
        displayRec(root);
    }
    public void displayRec(Node parent){
        StringBuilder ans = new StringBuilder();
        ans.append(parent.toString());
        ans.append(" -> ");
        for (Node child: parent.children) {
            ans.append(child.toString());
            ans.append(",");
        }
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans);
        for (Node child: parent.children) {
            displayRec(child);
        }

    }
    public int height(){
        return heightRec(root);
    }

    private int heightRec(Node parent) {
        if(parent==null)  return 0;
        int size=0;
        for (Node child: parent.children) {
            size=Math.max(size,heightRec(child));
        }
        return size+1;
    }
    public int size(){
        return sizeRec(root);
    }

    private int sizeRec(Node parent) {
        if(parent==null)  return 0;
        int size=0;
        for (Node child: parent.children) {
            size+=sizeRec(child);
        }
        return size+1;
    }
    public int max(){
        return maxRec(root);
    }

    private int maxRec(Node parent) {
        if(parent==null)  return 0;
        int max=parent.value;
        for (Node child: parent.children) {
            max=Math.max(max,maxRec(child));
        }
        return max;
    }
    public void traversal(){
        traversalRec(root);
    }

    private void traversalRec(Node parent) {
        if(parent==null)  return;
        //euler's left before recursion
        System.out.println("pre:" + parent.value);
        for (Node child: parent.children) {
            //this area can be treated as going from parent to child
            System.out.println("Edge pre:" + parent.value + " -->" + child.value);

            traversalRec(child);
            System.out.println("Edge post:" + parent.value + " -->"+ child.value);

        }
        //euler's right after coming recursion
        System.out.println("post:" + parent.value);

    }
    public void levelOrder(){
        levelIt(root);
    }

    private void levelIt(Node parent) {
        if(parent==null)  return;
        //rpa
        Queue<Node> q = new ArrayDeque<>();
        q.add(parent);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            for (Node child :q.peek().children) {
                q.add(child);
            }
            q.remove();
        }
        System.out.println(".");



    }
    public void levelOrderLinewise(){
        levelItLinewise(root);
    }

    private void levelItLinewise(Node parent) {
        if(parent==null)  return;
        Queue<Node> mq = new ArrayDeque<>();
        Queue<Node> cq = new ArrayDeque<>();
        mq.add(parent);

        while(!mq.isEmpty()){
            System.out.print(mq.peek() + "  ");
            for (Node child :mq.peek().children) {
                cq.add(child);
            }
            mq.remove();
            if(mq.isEmpty()){
                mq=cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }




    }

    public void levelOrderLinewiseZZ(){
        levelItLinewiseZZ(root);
    }

    private void levelItLinewiseZZ(Node parent) {
        if(parent==null)  return;
        Stack<Node> ms = new Stack<>();
        Stack<Node> cs = new Stack<>();
        ms.push(parent);
        int level=1;
        while(!ms.isEmpty()){
            System.out.print(ms.peek() + "  ");
            if(level%2==1){
                for (int i = 0; i < ms.peek().children.size(); i++) {
                    Node child = ms.peek().children.get(i);
                    cs.push(child);
                }
            }
            else{
                for(int i = ms.peek().children.size() -1;i>=0;i--){
                    Node child = ms.peek().children.get(i);
                    cs.push(child);
                }
            }
            ms.pop();
            if(ms.isEmpty()){
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
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
    public void prePostIterative(){
        prePostIterativeIt(root);
    }
    public void prePostIterativeIt(Node node){

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(node,-1));
        while(!st.isEmpty()){
            Pair top = st.peek();
            if(st.peek().state==-1){
                System.out.println("Pre: " + top.node.value);
                top.state++;
            }
            else if(top.state==top.node.children.size()){
                System.out.println("Post: " + top.node.value);
                st.pop();
            }
            else{
                st.push(new Pair(top.node.children.get(top.state),-1));
                top.state++;

            }
        }
        System.out.println("END");
    }

    public void removeLeaf(){
        remove(root);
    }

    private void remove(Node node){
        if(node==null)  return;
        node.children.removeIf(b -> b.children.isEmpty());
        for(Node child : node.children){
            remove(child);
        }
    }



}
