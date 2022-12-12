package com.latest.trees.genericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class GenericTree {
    private static class Node{
        int data;

        public Node() {

        }

        public Node(int data) {
            this.data = data;
        }

        ArrayList<Node> children = new ArrayList<>();
    }

    public static void displayPost(Node node){
        for (Node child: node.children) {
            displayPost(child);
        }
        StringBuilder str = new StringBuilder();
        str.append(node.data+" -> ");
        for (Node child: node.children) {
            str.append(child.data);
            str.append(", ");

        }
        str.append(".");
        System.out.println(str);
         
    }

    public static void display(Node node){
        StringBuilder str = new StringBuilder();
        str.append(node.data+" -> ");
        for (Node child: node.children) {
            str.append(child.data);
            str.append(", ");

        }
         str.append(".");
        System.out.println(str);
        for (Node child: node.children) {
            display(child);
        }
    }

    public static int size(Node node){
        int size=0;
        for (Node child: node.children) {
            size+=size(child);
        }
        return ++size;
    }

    public static int max(Node node){
        int max = Integer.MIN_VALUE;
        for (Node child:node.children) {
            max=Math.max(max,max(child));

        }
        max=Math.max(max,node.data);
        return max;
    }

    public static int height(Node node){
        int height = 0;
        for (Node child:node.children) {
            height=Math.max(height,height(child));

        }
        return height+1;
    }
    public static void levelOrder(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while(q.size()>0){
            node = q.remove();
            System.out.print(node.data +" " );
            for (Node child:node.children) {
                q.add(child);
            }
        }
        System.out.println(node.data);
    }



    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==-1){
                st.pop();

            }
            else{
                Node t = new Node(arr[i]);
                if(st.size()>0) {
                    st.peek().children.add(t);
                }
                else {
                    root=t;
                }
                st.push(t);
            }

        }
//        display(root);
//        System.out.println(size(root));
//        System.out.println(max(root));
//        System.out.println(height(root));
        levelOrder(root);


    }
}
