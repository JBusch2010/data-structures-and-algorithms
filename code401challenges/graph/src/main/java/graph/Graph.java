package graph;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

// https://github.com/codefellows/seattle-java-401d5/blob/master/class-35-graphs/implementation-examples/c-sharp/Classes/Graph.cs
public class Graph<T> {

    public HashMap<Vertex<T>, List<Edge<T>>> adjacencyList;
    public int size = 0;

    public Graph () {
        this.adjacencyList = new HashMap<>();
    }

    // Adds a new vertex
    public Vertex<T> addNode(T value) {
        Vertex<T> node = new Vertex<>(value);
        adjacencyList.put(node, new ArrayList<>());
        size++;
        return node;
    }

    //addDirectedEdge
    //adds an undirected edge between two vertices in a graph
    //"a" references first vertex, "b" references second vertex
    //"weight" is the value between both vertices
    public void addDirectedEdge(Vertex<T> a, Vertex<T> b, int weight) {
        Edge<T> edge = new Edge<>(weight, b);
        adjacencyList.get(a).add(edge);
    }

    // getNodes
    // returns all vertices in a graph
    public List<Vertex<T>> getNodes() {
        List<Vertex<T>> vertices = new ArrayList<>();

        for (Vertex<T> vertex : adjacencyList.keySet()) {
            vertices.add(vertex);
        }

        return vertices;
    }

    // getNeighbors
    // takes in a given vertex, including weight
    // returns a collection of connected vertices
    public List<Edge<T>> getNeighbors(Vertex<T> vertex) {
        return adjacencyList.get(vertex);
    }

    // size
    // returns the total number of vertices in the graph
    public int size() {
        return this.size;
    }

    public void breadthFirst(){
        
    }

}