package Lab;
import java.util.Date;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 10/3/2024
 * Objective: Q3: Implement a class named Account. 
 */

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }
    
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    
    public double withdraw(double w){
        return balance-=w;   
    }
    
    public double deposit(double d){
        return balance+=d;
    }
    
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.printf("Balance: RM%.2f",account.getBalance());
        System.out.println("\nMonthly Interest: "+account.getMonthlyInterestRate());
        System.out.println("Date account was created: "+account.getDateCreated());
    }
}
