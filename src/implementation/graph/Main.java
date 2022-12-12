package implementation.graph;

public class Main {
    public static void main(String[] args) {
        Graph<Integer> g = new Graph<>();
        g.addEdge(1,2,10);
        g.addEdge(0,3,40);
        g.addEdge(0,1,10);
        g.addEdge(2,3,10);
        g.addEdge(3,4,2);
        g.addEdge(4,5,3);
        g.addEdge(4,6,8);
        g.addEdge(5,6,3);
        g.printGraph();
        g.bfs(0);
        g.dfs(0);
    }
}
