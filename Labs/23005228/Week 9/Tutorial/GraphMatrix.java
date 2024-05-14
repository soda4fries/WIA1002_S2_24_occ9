/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

import java.util.ArrayList;

/**
 *
 * @author xinph
 */
public class GraphMatrix {
    
    ArrayList<Node> nodes;
    int [][] matrix;
    
    GraphMatrix(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    
    public void addNode(Node node){
        nodes.add(node);
    }
    
    public void addEdge(int src, int dst){ //src=row, dst=column
        matrix[src][dst] = 1;
    }
    
    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }
        else
            return false;
    }
    
    public void print(){
        
        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for(int i=0; i<matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
