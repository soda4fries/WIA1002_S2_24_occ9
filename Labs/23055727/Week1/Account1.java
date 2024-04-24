/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class Account1 extends Account {
    String name;
    ArrayList<Transaction> transactions;
    
    public static void main(String[] args) {
        Account1 a1 = new Account1("George", 1122, 1000);
        a1.setAnnualInterestRate(1.5);
        a1.deposit(30);
        a1.deposit(40);
        a1.deposit(50);
        a1.withdraw(5);
        a1.withdraw(4);
        a1.withdraw(2);
        System.out.println(a1);
    }
    
    Account1(String name, int id, double balance){
        super(id, balance);
        this.name = name;
        transactions = new ArrayList<Transaction>();
    }
    
    @Override
    void withdraw (double amount){
        
        if (amount < getBalance()){
            setBalance(getBalance() - amount);
            String desc = name + " withdrew " + amount + "\nNew Balance: " + getBalance();
            transactions.add(new Transaction('w',amount,getBalance(),desc));
        }
        else
            System.out.println("Invalid amount");
    }
    @Override
    void deposit (double amount) {
        setBalance(getBalance() + amount);
        String desc = name + " deposited " + amount + "\nNew Balance: " + getBalance();
        transactions.add(new Transaction('d',amount,getBalance(),desc));
    }
    @Override
    public String toString(){
        String s = "ACCOUNT SUMMARY\nName: " + name +
                "\nAnnual Interest Rate: " + getAnnualInterestRate() + 
                "\nAccount Balance: " + getBalance();
        for (Transaction t : transactions)
            s += "\n" + t.toString();
        return s;
    }
    
}

class Transaction {
    Date date;
    char type;
    double amount, balance;
    String description;
    
    Transaction(char type, double amount, double balance, String desc){
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        description = desc;
    }
    char getType(){
        return type;
    }
    void setType(char c){
        type = c;
    }
    double getAmount(){
        return amount;
    }
    void setAmount(double amount){
        this.amount = amount;
    }
    double getBalance(){
        return balance;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    String getDescription(){
        return description;
    }
    void setDescription(String desc){
        description = desc;
    }
    Date getDate(){
        return date;
    }
    
    @Override
    public String toString(){
        return "Transaction Date: " + getDate()
                + "\nTransaction Type: " + getType() +
                "\nTransaction Amount: " + getAmount() +
                "\nResulting Balance: " + getBalance() +
                "\n" + description;
    }
    
}
