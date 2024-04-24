/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Date;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000);
        a1.setAnnualInterestRate(4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("Balance: " + a1.getBalance());
        System.out.println("Monthly Interest: " + a1.getMonthlyInterest());
        System.out.println("Date Created: " + a1.getDateCreated());
    }
    
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    Account (int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    int getId() {
        return id;
    }
    double getBalance(){
        return balance;
    }
    double getAnnualInterestRate(){
        return annualInterestRate;
    }
    void setId(int i){
        id = i;
    }
    void setBalance (double b){
        balance = b;
    }
    void setAnnualInterestRate(double a){
        annualInterestRate = a;
    }
    Date getDateCreated(){
        return dateCreated;
    }
    double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate()/100;
    }
    void withdraw (double amount){
        if (amount < balance)
            balance -= amount;
        else
            System.out.println("Invalid amount");
    }
    void deposit (double amount) {
        balance += amount;
    }
    
    
}


