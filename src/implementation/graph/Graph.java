package implementation.graph;

import java.util.*;

public class Graph<T> {

    private HashMap<Vertex<T>, ArrayList<Edge>> adjacencyList;

    public Graph(){
        adjacencyList = new HashMap<>();

    }


    public void addEdge(T first, T second, int weight){
        ArrayList<Edge> list1,list2;
        Vertex<T> v1 = findVertex(first), v2 = findVertex(second);
        list1 = adjacencyList.get(v1);
        list2 = adjacencyList.get(v2);

        list1.add(new Edge(v1,v2,weight));
        list2.add(new Edge(v2,v1,weight));


    }

    public void printGraph(){
        System.out.println("\t...Graph...");
        for (ArrayList<Edge> list:adjacencyList.values()) {
            for (Edge e:list) {
                System.out.println(e.firstVertex + "   " + e);
            }
            System.out.println();
        }
        System.out.println(adjacencyList);

    }

    public Vertex<T> containsVertex(T value){
        if(value == null){
            throw new NullPointerException("Element not found");
        }

        for (Vertex<T> v:adjacencyList.keySet()) {
            if (v.data==value)  return v;
        }

        return null;
    }
    public Vertex<T> findVertex(T value){
        Vertex<T> v= containsVertex(value);
        if(v == null){
            v = new Vertex<>(value);
            adjacencyList.put(v,new ArrayList<>());
        }
        return v;
    }




    private void setAllVisitedFalse(){
        for (Vertex<T>v:adjacencyList.keySet()) {
            v.visited=false;
        }
    }

    public void bfs(T root){
        System.out.println("\t...bfs...");
        if(root==null){
            throw new NullPointerException("Root vertex cannot be null");
        }
        Vertex<T> rootVertex = containsVertex(root);
        if(rootVertex == null){
            throw new IllegalArgumentException("Root element not found");
        }
        setAllVisitedFalse();
        Queue<Vertex<T>> q = new ArrayDeque<>();
        q.add(rootVertex);
        rootVertex.visited= true;
        while(!q.isEmpty()){
            Vertex<T> top = q.remove();

            System.out.println(top);
            ArrayList<Edge> list  = adjacencyList.get(top);
            for (Edge e:list) {
                Vertex<T> v2 = e.secondVertex;
                if(!v2.visited){
                    q.add(v2);
                    v2.visited= true;
                }

            }

        }

    }

    public void dfs(T root){
        System.out.println("\t...bfs...");
        if(root==null){
            throw new NullPointerException("Root vertex cannot be null");
        }
        Vertex<T> rootVertex = containsVertex(root);
        if(rootVertex == null){
            throw new IllegalArgumentException("Root element not found");
        }
        setAllVisitedFalse();
        Stack<Vertex<T>> st = new Stack<>();
        st.push(rootVertex);
        rootVertex.visited= true;
        while(!st.isEmpty()){
            Vertex<T> top = st.pop();
            System.out.println(top);
            for (Edge e:adjacencyList.get(top)) {
                Vertex<T> adjacent = e.secondVertex;
                if(!adjacent.visited){
                    adjacent.visited=true;
                    st.add(adjacent);
                }
            }
        }
    }



    public static class Vertex<T>{
        private final T data;
        private boolean visited;

        public Vertex(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "" +data;

        }
    }
    public static class Edge{
        private Vertex firstVertex, secondVertex;
        private int weight;

        public Edge(Vertex firstVertex, Vertex secondVertex, int weight) {
            if (null == firstVertex || null == secondVertex) {
                throw new NullPointerException("Can't create Edge, one of the Vertex is null !!");
            }
            this.firstVertex = firstVertex;
            this.secondVertex = secondVertex;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return  firstVertex +"-" + weight +"-" + secondVertex;
        }
    }
}
