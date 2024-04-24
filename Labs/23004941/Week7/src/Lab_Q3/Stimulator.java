package Lab_Q3;
import Lab_Q1.MyQueue;

import java.util.Scanner;
public class Stimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue<Stock> queue = new MyQueue<>();

        int capital = 0;
        outer_loop:
        while (true) {
            System.out.print("Enter your query (In format 'Buy/Sell x shares at $y each'): ");
            String[] str = sc.nextLine().split(" ");
            int stockAmount = Integer.parseInt(str[1]);
            int stockPrice = Integer.parseInt(str[4].replaceAll("[^0-9]", ""));
            switch (str[0]) {
                case "Buy" :
                    System.out.println("Buying now...");
                    queue.enqueue(new Stock(stockAmount, stockPrice));
                    break;
                case "Sell" :
                    System.out.println("Selling now...");
                    int totalSell = Integer.parseInt(str[1]);
                    int currentValue = Integer.parseInt(str[4].replaceAll("[^0-9]", ""));
                    while (totalSell>0 && !queue.isEmpty()) {
                        if (queue.peek().getAmount() < totalSell) {
                            Stock handling = queue.dequeue();
                            totalSell -= handling.getAmount();
                            capital += handling.getAmount() * (currentValue - handling.getPrice());
                        }
                        else {
                            queue.peek().setAmount(queue.peek().getAmount() - totalSell);
                            capital += totalSell * (currentValue - queue.peek().getPrice());
                            break;
                        }
                    }
                    System.out.println("Total Capital Gain / Loss: " + capital);
                    break;
                case "STOP" :
                    break outer_loop;
                default :
                    System.out.println("Invalid Operation");
                    break;
            }
            showAmount(queue);
            showPrice(queue);
            System.out.println("\n========");
        }

    }
    public static void showAmount(MyQueue<Stock> queue) {
        System.out.print("Queue: [ ");
        for (int i=0; i<queue.getSize(); i++) {
            System.out.print(queue.getElement(i).getAmount());
            System.out.print(i == queue.getSize()-1? " ]" : ", ");
        }
    }

    public static void showPrice(MyQueue<Stock> queue) {
        System.out.print("Queue: [ ");
        for (int i=0; i<queue.getSize(); i++) {
            System.out.print(queue.getElement(i).getPrice());
            System.out.print(i == queue.getSize()-1? " ]" : ", ");
        }
    }
}
