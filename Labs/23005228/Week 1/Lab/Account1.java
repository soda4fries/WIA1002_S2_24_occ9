package Lab;
import java.util.Date;
import java.util.ArrayList;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 10/3/2024
 * Objective: Q4:  An Account class was specified in Question 3. Design a new Account1 class as follows. 
 */

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Transaction(Date date, char type, double balance, double balance1, String description){
        this.date = date;
        this.type = type;
        this.balance = balance;
        this.description = description;
    }
    
    
}

public class Account1{
    private String name;
    private int id;
    private double balance;
    private ArrayList<Transaction> transactions;
    
    
    public Account1(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void addTransaction(Date date, char type, double amount, String description) {
        Transaction transaction = new Transaction(date, type, amount, balance, description);
        transactions.add(transaction);
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println("Date: " + transaction.getDate() +
                    "\tType: " + transaction.getType() +
                    "\tAmount: RM" + transaction.getAmount() +
                    "\tBalance: RM" + transaction.getBalance() +
                    "\tDescription: " + transaction.getDescription());
        }
    }
     public static void main(String[] args) {
        Account1 account = new Account1("George", 1122, 1000);
        account.addTransaction(new Date(), 'D', 30, "Deposit");
        account.addTransaction(new Date(), 'D', 40, "Deposit");
        account.addTransaction(new Date(), 'D', 50, "Deposit");
        account.addTransaction(new Date(), 'W', 5, "Withdrawal");
        account.addTransaction(new Date(), 'W', 4, "Withdrawal");
        account.addTransaction(new Date(), 'W', 2, "Withdrawal");
        
        account.printTransactions();
    }
    
}

