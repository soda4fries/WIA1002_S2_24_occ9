public class MySinglyLinkedListTester {
    public static void main(String[] args) {
        MySinglyLinkedList<Integer> myList = new MySinglyLinkedList<>();
        myList.addFirst(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.add(1, 4);
        while (!myList.isEmpty()) {
            System.out.println(myList.removeFirst());
        }
        myList.addFirst(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.add(1, 4);
        while (!myList.isEmpty()) {
            System.out.println(myList.removeLast());
        }
        myList.addFirst(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.add(1, 4);
        myList.print();
        myList.printReverse();
        myList.reverseList();
        myList.print();
        myList.printReverse();

        myList.set(1, 5);
        myList.print();
        myList.add(1, 6);
        myList.print();
        System.out.printf(myList.getMiddle().toString());
    }
}
