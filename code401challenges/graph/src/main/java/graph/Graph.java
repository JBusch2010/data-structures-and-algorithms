package graph;

import javax.xml.soap.Node;
import java.util.*;

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

    public ArrayList<Vertex<T>> breadthFirst(Vertex<T> node) {
        // Extend your graph object with a breadth-first traversal method that accepts a starting node
        // Without utilizing any of the built-in methods available to your language,
        // return a collection of nodes in the order they were visited. Display the collection

        ArrayList<Vertex<T>> result = new ArrayList<>();
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(node);
        node.visisted = true;

        while (queue.peek() != null) {
            Vertex<T> v = queue.remove();
            result.add(v);

            List<Edge<T>> neighbors = getNeighbors(v);

            for (int i = 0; i < neighbors.size(); i++) {
                Vertex<T> vertexAtIndex = neighbors.get(i).vertex;

                if (vertexAtIndex != null && !vertexAtIndex.visisted) {
                    queue.add(vertexAtIndex);
                    vertexAtIndex.visisted = true;
                }
            }
        }

        return result;
    }

    public ArrayList<T> depthFirst(Graph<T> graph, Vertex<T> node) {
        Stack<Vertex<T>> stack = new Stack<>();
        ArrayList<T> result = new ArrayList<>();

        if (node == null) {
            return null;
        } else {
            stack.push(node);
            node.visisted = true;
        }

        while (!stack.isEmpty()) {
            Vertex<T> current = stack.pop();
            result.add(current.value);

            List<Edge<T>> neighbors = getNeighbors(current);

            for (int i = 0; i < neighbors.size(); i++) {
                Vertex<T> vertexAtIndex = neighbors.get(i).vertex;

                if (vertexAtIndex != null && !vertexAtIndex.visisted) {
                    stack.push(vertexAtIndex);
                    vertexAtIndex.visisted = true;
                }
            }
        }

        return result;
    }



}