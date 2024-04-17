

public class BagTester {

    public static void main(String[] args) {
        Bag<Integer> bag1 = new LinkedListBag<>();
        Bag<Integer> bag2 = new ArrayBag<>(10);
        Bag<Integer> unionBag;
        Bag<Integer> intersectionBag;
        Bag<Integer> differenceBag;
    

        // Adding elements to bag1
        bag1.add(1);
        bag1.add(2);
        bag1.add(3);

        // Adding elements to bag2
        bag2.add(3);
        bag2.add(4);
        bag2.add(5);

        System.out.println("Bag 1: " + bag1);
        System.out.println("Bag 2: " + bag2);

        // Testing union operation
        unionBag = bag1.union(bag2);
        System.out.println("Union Bag: " + unionBag.toString());

        // Testing intersection operation
        intersectionBag = bag1.intersection(bag2);
        System.out.println("Intersection Bag: " + intersectionBag.toString());

        // Testing difference operation
        differenceBag = bag1.difference(bag2);
        System.out.println("Difference Bag (bag1 - bag2): " + differenceBag.toString());

        // Testing addAll operation
        bag1.addAll(bag2);
        System.out.println("Bag1 after adding all elements from bag2: " + bag1);

        // Testing putAll operation
        bag1.putAll(bag2);
        System.out.println("Bag1 after putting all elements to bag2: " + bag1);

        // Testing removal
        System.out.println("Removed element: " + bag2.remove());

        // Testing getCurrentSize
        System.out.println("Current size of bag2: " + bag2.getCurrentSize());

        // Testing getFrequencyOf
        System.out.println("Frequency of 3 in bag2: " + bag2.getFrequencyOf(3));

        // Testing contains
        System.out.println("Bag2 contains 5: " + bag1.contains(5));
        System.out.println("Bag2 contains 6: " + bag1.contains(6));

        // Testing clear
        bag1.clear();
        System.out.println("Bag1 after clearing: " + bag1);

        ArrayBag<Number> NumberBag = new ArrayBag<>();
        NumberBag.add(10);
        NumberBag.add(20);
        NumberBag.add(30);
        ArrayBag<Integer> IntegerBag = new ArrayBag<>();
        IntegerBag.add(15);
        IntegerBag.add(25);
        IntegerBag.add(35);
        NumberBag.addAll(IntegerBag);
        IntegerBag.putAll(NumberBag);

        System.out.println("IntegerBag: " + IntegerBag);
        System.out.println("NumberBag " + NumberBag);

    }
}
