package week6;
import java.util.Stack;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 5; // Number of disks
        char source = 'A', destination = 'C', auxiliary = 'B'; // Rods

        System.out.println("Steps to solve Tower of Hanoi with " + n + " disks:");
        solveTowerOfHanoi(n, source, destination, auxiliary);
    }

    public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        Stack<Integer> sourceStack = new Stack<>();
        Stack<Integer> destinationStack = new Stack<>();
        Stack<Integer> auxiliaryStack = new Stack<>();

        // Push disks onto source stack in descending order
        for (int i = n; i >= 1; i--) {
            sourceStack.push(i);
        }

        // Print initial state
        printState(sourceStack, destinationStack, auxiliaryStack);

        // Call recursive function to solve Tower of Hanoi
        moveDisks(n, source, destination, auxiliary, sourceStack, destinationStack, auxiliaryStack);

        System.out.println("Tower of Hanoi solved!");
    }

    private static void moveDisks(int n, char source, char destination, char auxiliary,
                                  Stack<Integer> sourceStack, Stack<Integer> destinationStack, Stack<Integer> auxiliaryStack) {
        if (n > 0) {
            // Move n-1 disks from source to auxiliary using destination as auxiliary
            moveDisks(n - 1, source, auxiliary, destination, sourceStack, auxiliaryStack, destinationStack);

            // Move disk from source to destination
            int disk = sourceStack.pop();
            destinationStack.push(disk);

            // Print current state
            printState(sourceStack, destinationStack, auxiliaryStack);

            // Move n-1 disks from auxiliary to destination using source as auxiliary
            moveDisks(n - 1, auxiliary, destination, source, auxiliaryStack, destinationStack, sourceStack);
        }
    }

    private static void printState(Stack<Integer> source, Stack<Integer> destination, Stack<Integer> auxiliary) {
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println();
    }
}
