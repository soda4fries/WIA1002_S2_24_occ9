package week3;
/**
 *
 * @author Anas Mohammad 23055727
 */
public class ArrayBagDemo {
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        testAdd(bag1, contentsOfBag1);
        testAdd(bag2, contentsOfBag2);
        
        System.out.println("Bag1:\nAdding A A B A C A");
        displayBag(bag1);
        System.out.println("Bag2;\nAdding A B A C B C D another string");
        displayBag(bag2);
        
        BagInterface<String> bag3 = bag1.union(bag2);
        System.out.println("Bag3, test the method union of bag 1 and bag2:");
        displayBag(bag3);
        
        BagInterface<String> bag4 = bag1.intersection(bag2);
        System.out.println("Bag4, test the method intersection of bag1 and bag2:");
        displayBag(bag4);
        
        BagInterface<String> bag5 = bag1.difference(bag2);
        System.out.println("Bag5, test the method difference of bag1 and bag2: ");
        displayBag(bag5);
    }
    
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        for (String s : content)
            aBag.add(s);
    }
    private static void displayBag(BagInterface<String> aBag){
        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows:");
        Object[] s = aBag.toArray();
        for (Object t : s)
            System.out.print(t + " ");
        System.out.println("\n");
    }
}
