package LabA;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StockGainLossCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyQueue<String> share = new MyQueue<>();
        MyQueue<String> price = new MyQueue<>();

        int totalGainLoss = 0;
        while (true) {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            else {
                String[] tokens = input.split(" ");
                String buySell = tokens[0];
                String numOfShare = tokens[1];
                String buySellPrice = tokens[4].replace("$", ""); //replace "$"

                // for Sell
                if (buySell.equalsIgnoreCase("Sell")) {
                    System.out.println("Selling the share now...");
                    int shareToSell = Integer.parseInt(numOfShare);

                    int remainingShare = 0;
                    do {
                        if (!share.isEmpty()) {
                            int share1 = Integer.parseInt(share.dequeue());
                            int price1 = Integer.parseInt(price.dequeue());

                            // if share sufficient
                            if (share1 >= shareToSell) {
                                totalGainLoss = totalGainLoss + shareToSell * (Integer.parseInt(buySellPrice) - price1);
                                remainingShare = share1 - shareToSell;

                                // remaining share after sell
                                if (remainingShare > 0) {
                                    insertRemaining(share, remainingShare);
                                    insertRemaining(price, price1);
                                }

                            }
                            //if share insufficient
                            else {
                                totalGainLoss = totalGainLoss + share1 * (Integer.parseInt(buySellPrice) - price1);
                            }

                            System.out.println("Total Capital Gain / Loss: " + totalGainLoss);
                            shareToSell = shareToSell - share1;
                        }
                        else {
                            System.out.println("No share to sell!");
                            shareToSell = 0;
                        }

                    } while (shareToSell > 0);
                }
                
                // for Buy
                else if (buySell.equalsIgnoreCase("Buy")) {
                    System.out.println("Buying now...");
                    share.enqueue(numOfShare);
                    price.enqueue(buySellPrice);
                }
                else {
                    System.out.println("Invalid Input!");
                    continue;
                }

                // Print current queue status
                System.out.println("Queue for Share: " + share);
                System.out.println("Queue for Price: " + price);
            }
        }

        System.out.println("Final Capital Gain / Loss: " + totalGainLoss);
    }

    // inserts the remaining integer at the front of the original queue
    public static void insertRemaining(MyQueue<String> queue, int remaining) {
        MyQueue<String> temp = new MyQueue<>(); // create temporary queue "temp"
        temp.enqueue(Integer.toString(remaining)); // enqueue "remaining" into "temp"
        while (!queue.isEmpty()) {
            temp.enqueue(queue.dequeue()); // dequeue element from original queue, enqueue it into "temp"
        }
        while (!temp.isEmpty()) {
            queue.enqueue(temp.dequeue()); // dequeue element from "tempt", enqueue it into original queue
        }
    }
}

