/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.BST;

/**
 *
 * @author xinph
 */

public class TestBST {
    public static void main(String[] args) {
        // Create a BST
        BST<Integer> tree = new BST<>();
        int[] input = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};

        for (int i : input) {
            tree.insert(i);
        }
        
        System.out.print("Input Data: ");
        for(int i=0; i< input.length-1; i++){
            System.out.print(input[i]+", ");
        }
        System.out.println(input[input.length-1]);

        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder();
        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder();
        System.out.println();

        System.out.println("Height of BST: " + tree.height());
        System.out.println("Root for BST is: " + tree.getRoot().element);
        System.out.println("Check whether 10 is in the tree? " + tree.search(10));

        System.out.println("Delete 53");
        tree.delete(53);

        System.out.print("Updated Inorder data (sorted): ");
        tree.inorder();
        System.out.println();

        System.out.println("Min Value: " + tree.minValue());
        System.out.println("Max Value: " + tree.maxValue());

        System.out.print("A path from the root to 6 is: ");
        for (TreeNode<Integer> node : tree.path(6)) {
            System.out.print(node.element + " ");
        }
        System.out.println();
    }
}

