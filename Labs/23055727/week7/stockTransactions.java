package week7;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stockTransactions {
    static boolean running;
    static MyQueue<Float> myQueue = new MyQueue<>();
    static Scanner sc = new Scanner(System.in);
    static int day = 0;
    static float sum = 0, sum1 = 0;

    public static void main(String[] args) {
        start();
        while (running) {
            getInput();
            displayStatus();
        }
        System.out.println("program ended...");
    }

    static void start() {
        System.out.println("program has started...");
        running = true;
    }

    static void getInput() {
        System.out.println("Day " + day++ + "...");
        System.out.print("Enter your query \"(buy/sell) x shares at y$\" ");
        String s = sc.nextLine();
        Pattern pattern = Pattern.compile("\\b(buy|sell)\\s+(\\d+)\\s+shares\\s+at\\s+(\\d+)\\$");
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            String action = matcher.group(1);
            String amount = matcher.group(2);
            String price = matcher.group(3);

            if (action.equalsIgnoreCase("buy")) {
                buy(amount, price);
            } else if (action.equalsIgnoreCase("sell")) {
                sell(amount, price);
            }
        } else {
            System.out.println("Invalid input format.");
        }
    }

    static void buy(String amount, String price) {
        int a = Integer.parseInt(amount);
        float p = Float.parseFloat(price);
        for (int i = 0; i < a; i++) {
            myQueue.enqueue(p);
        }
        System.out.println("You have " + myQueue.getSize() + " shares");
    }

    static void sell(String amount, String price) {
        int a = Integer.parseInt(amount);
        float p = Float.parseFloat(price);
        int x = 0;
        for (int i = 0; i < a; i++) {
            if (!myQueue.isEmpty()) {
                sum += p;
                sum1 += myQueue.dequeue();
            }
        }
        if (myQueue.isEmpty())
            System.out.println("You have no more shares");
        else
            System.out.println("You have " + myQueue.getSize() + " shares");
        System.out.println("You have sold " + x + " shares successfully");
    }

    static void displayStatus() {
        if (sum != 0) {
            System.out.println("Current gain/loss : " + (sum - sum1));
        }
    }
}





class MyQueue <E extends Comparable<E>> {


    private LinkedList<E> list = new LinkedList<>();

    public MyQueue(E[] e) {
        for (E item : e)
            list.add(item);
    }

    public MyQueue(){
        return;
    }
    public void enqueue(E e){
        list.addLast(e);
    }
    public E dequeue(){
        return list.removeFirst();
    }
    public E getElement(int i){
        return list.get(i);
    }
    public E peek(){
        return list.getFirst();
    }
    public int getSize(){
        return list.size();
    }
    public boolean contains(E e){
        return list.contains(e);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String tostring(){
        return "Queue:\n" + list.toString();
    }
    
        
}
