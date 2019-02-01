package trees;

import java.util.LinkedList;

public class Graph {

    int vertices;
    LinkedList<Integer> adjList[] ;

    public Graph(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (LinkedList<Integer> list :
                adjList) {
            list = new LinkedList<>();
        }
    }

    void addEdge(int vertex, int newEdge){
        adjList[vertex].add(newEdge);
    }
}
