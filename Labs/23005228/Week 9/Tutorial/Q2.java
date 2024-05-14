/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 * Adjacency Matrix = 2D array to store 1/0 to represent edges
 * @author xinph
 */
public class Q2 {
    
    public static void main(String[] args) {
        
        GraphMatrix graph = new GraphMatrix(9);
        
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        graph.addNode(new Node('F'));
        graph.addNode(new Node('G'));
        graph.addNode(new Node('H'));
        graph.addNode(new Node('I'));
        
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        
        graph.print();
        
        System.out.println(graph.checkEdge(0, 1));
    }
}
