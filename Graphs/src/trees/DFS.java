package trees;

public class DFS {

    public static void main(String... args){

        // set up graph
        Graph  graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 3);
        graph.addEdge(5, 2);
    }

}
