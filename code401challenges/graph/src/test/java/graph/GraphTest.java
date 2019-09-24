package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addNode () {
        Graph<String> graph = new Graph<>();
        Vertex<String> node = graph.addNode("Naruto");

        assertTrue(graph.adjacencyList.containsKey(node));

        System.out.println(node.value);
    }

    @Test
    public void addMultiNodes () {
        Graph<String> graph = new Graph<>();
        Vertex<String> node1 = graph.addNode("Naruto");
        Vertex<String> node2 = graph.addNode("Sasuke");
        Vertex<String> node3 = graph.addNode("Sakura");

        assertTrue(graph.adjacencyList.containsKey(node1));
        assertTrue(graph.adjacencyList.containsKey(node2));
        assertTrue(graph.adjacencyList.containsKey(node3));

        System.out.println(node1.value);
        System.out.println(node2.value);
        System.out.println(node3.value);
    }

    @Test
    public void nodeDoesNotExist() {
        Graph<String> graph = new Graph<>();
        Vertex<String> node1 = graph.addNode("Madara");
        Vertex<String> node2 = new Vertex<>("Hashirama");

        assertFalse(graph.adjacencyList.containsKey(node2));
    }

    @Test
    public void addDirectedEdge () {
        Graph<String> graph = new Graph<>();
        Vertex<String> node1 = graph.addNode("Madara");
        Vertex<String> node2 = graph.addNode("Hashirama");

        graph.addDirectedEdge(node1, node2, 10);

        assertEquals(10, graph.adjacencyList.get(node1).get(0).weight);
    }

    @Test
    public void getNodes () {
        Graph<String> graph = new Graph<>();
        Vertex<String> node1 = graph.addNode("Naruto");
        Vertex<String> node2 = graph.addNode("Sasuke");

        assertTrue(graph.getNodes().contains(node1));
        assertTrue(graph.getNodes().contains(node2));
    }

    @Test
    public void getNeighbors () {
    }
}